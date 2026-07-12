package decompiler;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class JavaDecompiler {
    public static void main(String[] args) throws Exception {
        String classPath = "c:\\Users\\User\\Desktop\\BrProject\\bin\\main";
        String outputPath = "c:\\Users\\User\\Desktop\\BrProject\\java\\src-decompiled";
        
        Files.createDirectories(Paths.get(outputPath));
        
        // Walk through all .class files
        Files.walk(Paths.get(classPath))
            .filter(p -> p.toString().endsWith(".class"))
            .forEach(classFile -> {
                try {
                    decompileClass(classFile, classPath, outputPath);
                } catch (Exception e) {
                    System.err.println("Erro ao descompilar " + classFile + ": " + e.getMessage());
                }
            });
    }
    
    private static void decompileClass(Path classFile, String classPath, String outputPath) throws Exception {
        String relativePath = Paths.get(classPath).relativize(classFile).toString();
        String className = relativePath.replace(".class", "").replace("\\", ".");
        
        // Run javap
        ProcessBuilder pb = new ProcessBuilder(
            "javap", "-c", "-v",
            "-cp", classPath,
            className
        );
        
        pb.redirectErrorStream(true);
        Process p = pb.start();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\n");
        }
        
        p.waitFor();
        
        // Save to file
        String outputFile = outputPath + "\\" + relativePath.replace(".class", ".txt");
        Files.createDirectories(Paths.get(outputFile).getParent());
        Files.write(Paths.get(outputFile), sb.toString().getBytes());
        
        System.out.println("Decompilado: " + className);
    }
}
