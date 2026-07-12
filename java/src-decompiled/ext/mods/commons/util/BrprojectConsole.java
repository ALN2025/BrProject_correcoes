// Bytecode for: ext.mods.commons.util.BrprojectConsole
// File: ext\mods\commons\util\BrprojectConsole.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/util/BrprojectConsole.class
  Last modified 9 de jul de 2026; size 3561 bytes
  MD5 checksum 90f12a6c4216f19a92ac7c7b7b1a791b
  Compiled from "BrprojectConsole.java"
public final class ext.mods.commons.util.BrprojectConsole
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #24                         // ext/mods/commons/util/BrprojectConsole
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // launcher
    #8 = Utf8               launcher
    #9 = String             #10           // brproject.role
   #10 = Utf8               brproject.role
   #11 = Methodref          #12.#13       // java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
   #12 = Class              #14           // java/lang/System
   #13 = NameAndType        #15:#16       // getProperty:(Ljava/lang/String;)Ljava/lang/String;
   #14 = Utf8               java/lang/System
   #15 = Utf8               getProperty
   #16 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #17 = Methodref          #18.#19       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #18 = Class              #20           // java/lang/String
   #19 = NameAndType        #21:#22       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #20 = Utf8               java/lang/String
   #21 = Utf8               equalsIgnoreCase
   #22 = Utf8               (Ljava/lang/String;)Z
   #23 = Methodref          #24.#25       // ext/mods/commons/util/BrprojectConsole.freeConsoleWindows:()V
   #24 = Class              #26           // ext/mods/commons/util/BrprojectConsole
   #25 = NameAndType        #27:#6        // freeConsoleWindows:()V
   #26 = Utf8               ext/mods/commons/util/BrprojectConsole
   #27 = Utf8               freeConsoleWindows
   #28 = Methodref          #12.#29       // java/lang/System.console:()Ljava/io/Console;
   #29 = NameAndType        #30:#31       // console:()Ljava/io/Console;
   #30 = Utf8               console
   #31 = Utf8               ()Ljava/io/Console;
   #32 = Class              #33           // java/lang/Thread
   #33 = Utf8               java/lang/Thread
   #34 = InvokeDynamic      #0:#35        // #0:run:()Ljava/lang/Runnable;
   #35 = NameAndType        #36:#37       // run:()Ljava/lang/Runnable;
   #36 = Utf8               run
   #37 = Utf8               ()Ljava/lang/Runnable;
   #38 = String             #39           // Brproject-FreeConsole
   #39 = Utf8               Brproject-FreeConsole
   #40 = Methodref          #32.#41       // java/lang/Thread."<init>":(Ljava/lang/Runnable;Ljava/lang/String;)V
   #41 = NameAndType        #5:#42        // "<init>":(Ljava/lang/Runnable;Ljava/lang/String;)V
   #42 = Utf8               (Ljava/lang/Runnable;Ljava/lang/String;)V
   #43 = Methodref          #32.#44       // java/lang/Thread.setDaemon:(Z)V
   #44 = NameAndType        #45:#46       // setDaemon:(Z)V
   #45 = Utf8               setDaemon
   #46 = Utf8               (Z)V
   #47 = Methodref          #32.#48       // java/lang/Thread.start:()V
   #48 = NameAndType        #49:#6        // start:()V
   #49 = Utf8               start
   #50 = String             #51           // os.name
   #51 = Utf8               os.name
   #52 = String             #53           //
   #53 = Utf8
   #54 = Methodref          #12.#55       // java/lang/System.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #55 = NameAndType        #15:#56       // getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #56 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #57 = Methodref          #18.#58       // java/lang/String.toLowerCase:()Ljava/lang/String;
   #58 = NameAndType        #59:#60       // toLowerCase:()Ljava/lang/String;
   #59 = Utf8               toLowerCase
   #60 = Utf8               ()Ljava/lang/String;
   #61 = String             #62           // win
   #62 = Utf8               win
   #63 = Methodref          #18.#64       // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
   #64 = NameAndType        #65:#66       // contains:(Ljava/lang/CharSequence;)Z
   #65 = Utf8               contains
   #66 = Utf8               (Ljava/lang/CharSequence;)Z
   #67 = InterfaceMethodref #68.#69       // java/lang/foreign/Linker.nativeLinker:()Ljava/lang/foreign/Linker;
   #68 = Class              #70           // java/lang/foreign/Linker
   #69 = NameAndType        #71:#72       // nativeLinker:()Ljava/lang/foreign/Linker;
   #70 = Utf8               java/lang/foreign/Linker
   #71 = Utf8               nativeLinker
   #72 = Utf8               ()Ljava/lang/foreign/Linker;
   #73 = InterfaceMethodref #74.#75       // java/lang/foreign/SymbolLookup.loaderLookup:()Ljava/lang/foreign/SymbolLookup;
   #74 = Class              #76           // java/lang/foreign/SymbolLookup
   #75 = NameAndType        #77:#78       // loaderLookup:()Ljava/lang/foreign/SymbolLookup;
   #76 = Utf8               java/lang/foreign/SymbolLookup
   #77 = Utf8               loaderLookup
   #78 = Utf8               ()Ljava/lang/foreign/SymbolLookup;
   #79 = InterfaceMethodref #68.#80       // java/lang/foreign/Linker.defaultLookup:()Ljava/lang/foreign/SymbolLookup;
   #80 = NameAndType        #81:#78       // defaultLookup:()Ljava/lang/foreign/SymbolLookup;
   #81 = Utf8               defaultLookup
   #82 = InterfaceMethodref #74.#83       // java/lang/foreign/SymbolLookup.or:(Ljava/lang/foreign/SymbolLookup;)Ljava/lang/foreign/SymbolLookup;
   #83 = NameAndType        #84:#85       // or:(Ljava/lang/foreign/SymbolLookup;)Ljava/lang/foreign/SymbolLookup;
   #84 = Utf8               or
   #85 = Utf8               (Ljava/lang/foreign/SymbolLookup;)Ljava/lang/foreign/SymbolLookup;
   #86 = String             #87           // FreeConsole
   #87 = Utf8               FreeConsole
   #88 = InterfaceMethodref #74.#89       // java/lang/foreign/SymbolLookup.find:(Ljava/lang/String;)Ljava/util/Optional;
   #89 = NameAndType        #90:#91       // find:(Ljava/lang/String;)Ljava/util/Optional;
   #90 = Utf8               find
   #91 = Utf8               (Ljava/lang/String;)Ljava/util/Optional;
   #92 = Methodref          #93.#94       // java/util/Optional.isEmpty:()Z
   #93 = Class              #95           // java/util/Optional
   #94 = NameAndType        #96:#97       // isEmpty:()Z
   #95 = Utf8               java/util/Optional
   #96 = Utf8               isEmpty
   #97 = Utf8               ()Z
   #98 = Methodref          #93.#99       // java/util/Optional.get:()Ljava/lang/Object;
   #99 = NameAndType        #100:#101     // get:()Ljava/lang/Object;
  #100 = Utf8               get
  #101 = Utf8               ()Ljava/lang/Object;
  #102 = Class              #103          // java/lang/foreign/MemorySegment
  #103 = Utf8               java/lang/foreign/MemorySegment
  #104 = Class              #105          // java/lang/foreign/MemoryLayout
  #105 = Utf8               java/lang/foreign/MemoryLayout
  #106 = InterfaceMethodref #107.#108     // java/lang/foreign/FunctionDescriptor.ofVoid:([Ljava/lang/foreign/MemoryLayout;)Ljava/lang/foreign/FunctionDescriptor;
  #107 = Class              #109          // java/lang/foreign/FunctionDescriptor
  #108 = NameAndType        #110:#111     // ofVoid:([Ljava/lang/foreign/MemoryLayout;)Ljava/lang/foreign/FunctionDescriptor;
  #109 = Utf8               java/lang/foreign/FunctionDescriptor
  #110 = Utf8               ofVoid
  #111 = Utf8               ([Ljava/lang/foreign/MemoryLayout;)Ljava/lang/foreign/FunctionDescriptor;
  #112 = Class              #113          // java/lang/foreign/Linker$Option
  #113 = Utf8               java/lang/foreign/Linker$Option
  #114 = InterfaceMethodref #68.#115      // java/lang/foreign/Linker.downcallHandle:(Ljava/lang/foreign/MemorySegment;Ljava/lang/foreign/FunctionDescriptor;[Ljava/lang/foreign/Linker$Option;)Ljava/lang/invoke/MethodHandle;
  #115 = NameAndType        #116:#117     // downcallHandle:(Ljava/lang/foreign/MemorySegment;Ljava/lang/foreign/FunctionDescriptor;[Ljava/lang/foreign/Linker$Option;)Ljava/lang/invoke/MethodHandle;
  #116 = Utf8               downcallHandle
  #117 = Utf8               (Ljava/lang/foreign/MemorySegment;Ljava/lang/foreign/FunctionDescriptor;[Ljava/lang/foreign/Linker$Option;)Ljava/lang/invoke/MethodHandle;
  #118 = Methodref          #119.#120     // java/lang/invoke/MethodHandle.invoke:()V
  #119 = Class              #121          // java/lang/invoke/MethodHandle
  #120 = NameAndType        #122:#6       // invoke:()V
  #121 = Utf8               java/lang/invoke/MethodHandle
  #122 = Utf8               invoke
  #123 = Class              #124          // java/lang/Throwable
  #124 = Utf8               java/lang/Throwable
  #125 = Long               400l
  #127 = Methodref          #32.#128      // java/lang/Thread.sleep:(J)V
  #128 = NameAndType        #129:#130     // sleep:(J)V
  #129 = Utf8               sleep
  #130 = Utf8               (J)V
  #131 = Long               600l
  #133 = Class              #134          // java/lang/InterruptedException
  #134 = Utf8               java/lang/InterruptedException
  #135 = Methodref          #32.#136      // java/lang/Thread.currentThread:()Ljava/lang/Thread;
  #136 = NameAndType        #137:#138     // currentThread:()Ljava/lang/Thread;
  #137 = Utf8               currentThread
  #138 = Utf8               ()Ljava/lang/Thread;
  #139 = Methodref          #32.#140      // java/lang/Thread.interrupt:()V
  #140 = NameAndType        #141:#6       // interrupt:()V
  #141 = Utf8               interrupt
  #142 = Utf8               Code
  #143 = Utf8               LineNumberTable
  #144 = Utf8               LocalVariableTable
  #145 = Utf8               this
  #146 = Utf8               Lext/mods/commons/util/BrprojectConsole;
  #147 = Utf8               detachLauncherLoadingConsole
  #148 = Utf8               StackMapTable
  #149 = Utf8               detachLauncherLoadingConsoleDelayed
  #150 = Utf8               t
  #151 = Utf8               Ljava/lang/Thread;
  #152 = Utf8               linker
  #153 = Utf8               Ljava/lang/foreign/Linker;
  #154 = Utf8               lookup
  #155 = Utf8               Ljava/lang/foreign/SymbolLookup;
  #156 = Utf8               sym
  #157 = Utf8               Ljava/util/Optional;
  #158 = Utf8               LocalVariableTypeTable
  #159 = Utf8               Ljava/util/Optional<Ljava/lang/foreign/MemorySegment;>;
  #160 = Utf8               lambda$detachLauncherLoadingConsoleDelayed$0
  #161 = Utf8               ignored
  #162 = Utf8               Ljava/lang/InterruptedException;
  #163 = Utf8               SourceFile
  #164 = Utf8               BrprojectConsole.java
  #165 = Utf8               BootstrapMethods
  #166 = MethodType         #6            //  ()V
  #167 = MethodHandle       6:#168        // REF_invokeStatic ext/mods/commons/util/BrprojectConsole.lambda$detachLauncherLoadingConsoleDelayed$0:()V
  #168 = Methodref          #24.#169      // ext/mods/commons/util/BrprojectConsole.lambda$detachLauncherLoadingConsoleDelayed$0:()V
  #169 = NameAndType        #160:#6       // lambda$detachLauncherLoadingConsoleDelayed$0:()V
  #170 = MethodHandle       6:#171        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #171 = Methodref          #172.#173     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #172 = Class              #174          // java/lang/invoke/LambdaMetafactory
  #173 = NameAndType        #175:#176     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #174 = Utf8               java/lang/invoke/LambdaMetafactory
  #175 = Utf8               metafactory
  #176 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #177 = Utf8               InnerClasses
  #178 = Utf8               Option
  #179 = Class              #180          // java/lang/invoke/MethodHandles$Lookup
  #180 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #181 = Class              #182          // java/lang/invoke/MethodHandles
  #182 = Utf8               java/lang/invoke/MethodHandles
  #183 = Utf8               Lookup
{
  public static void detachLauncherLoadingConsole();
    descriptor: ()V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: ldc           #7                  // String launcher
         2: ldc           #9                  // String brproject.role
         4: invokestatic  #11                 // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
         7: invokevirtual #17                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        10: ifne          14
        13: return
        14: invokestatic  #23                 // Method freeConsoleWindows:()V
        17: return
      LineNumberTable:
        line 19: 0
        line 20: 13
        line 22: 14
        line 23: 17
      StackMapTable: number_of_entries = 1
        frame_type = 14 /* same */

  public static void detachLauncherLoadingConsoleDelayed();
    descriptor: ()V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=1, args_size=0
         0: ldc           #7                  // String launcher
         2: ldc           #9                  // String brproject.role
         4: invokestatic  #11                 // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
         7: invokevirtual #17                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        10: ifne          14
        13: return
        14: invokestatic  #28                 // Method java/lang/System.console:()Ljava/io/Console;
        17: ifnonnull     21
        20: return
        21: new           #32                 // class java/lang/Thread
        24: dup
        25: invokedynamic #34,  0             // InvokeDynamic #0:run:()Ljava/lang/Runnable;
        30: ldc           #38                 // String Brproject-FreeConsole
        32: invokespecial #40                 // Method java/lang/Thread."<init>":(Ljava/lang/Runnable;Ljava/lang/String;)V
        35: astore_0
        36: aload_0
        37: iconst_1
        38: invokevirtual #43                 // Method java/lang/Thread.setDaemon:(Z)V
        41: aload_0
        42: invokevirtual #47                 // Method java/lang/Thread.start:()V
        45: return
      LineNumberTable:
        line 28: 0
        line 29: 13
        line 30: 14
        line 31: 20
        line 33: 21
        line 46: 36
        line 47: 41
        line 48: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           36      10     0     t   Ljava/lang/Thread;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 6 /* same */
}
SourceFile: "BrprojectConsole.java"
BootstrapMethods:
  0: #170 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #166 ()V
      #167 REF_invokeStatic ext/mods/commons/util/BrprojectConsole.lambda$detachLauncherLoadingConsoleDelayed$0:()V
      #166 ()V
InnerClasses:
  public static #178= #112 of #68;        // Option=class java/lang/foreign/Linker$Option of class java/lang/foreign/Linker
  public static final #183= #179 of #181; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
