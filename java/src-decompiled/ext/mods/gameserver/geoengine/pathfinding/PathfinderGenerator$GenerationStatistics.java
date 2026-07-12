// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.PathfinderGenerator$GenerationStatistics
// File: ext\mods\gameserver\geoengine\pathfinding\PathfinderGenerator$GenerationStatistics.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics.class
  Last modified 9 de jul de 2026; size 1419 bytes
  MD5 checksum 992b4135423a0dce8603a74ff5760cde
  Compiled from "PathfinderGenerator.java"
public class ext.mods.gameserver.geoengine.pathfinding.PathfinderGenerator$GenerationStatistics
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 3, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics.totalWaypoints:I
   #8 = Class              #10            // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics
   #9 = NameAndType        #11:#12        // totalWaypoints:I
  #10 = Utf8               ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics
  #11 = Utf8               totalWaypoints
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics.totalPaths:I
  #14 = NameAndType        #15:#12        // totalPaths:I
  #15 = Utf8               totalPaths
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics.generatedPaths:I
  #17 = NameAndType        #18:#12        // generatedPaths:I
  #18 = Utf8               generatedPaths
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics.failedPaths:I
  #20 = NameAndType        #21:#12        // failedPaths:I
  #21 = Utf8               failedPaths
  #22 = String             #23            // Generation Stats - Waypoints: %d, Total Paths: %d, Generated: %d, Failed: %d, Success Rate: %.1f%%
  #23 = Utf8               Generation Stats - Waypoints: %d, Total Paths: %d, Generated: %d, Failed: %d, Success Rate: %.1f%%
  #24 = Methodref          #25.#26        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #25 = Class              #27            // java/lang/Integer
  #26 = NameAndType        #28:#29        // valueOf:(I)Ljava/lang/Integer;
  #27 = Utf8               java/lang/Integer
  #28 = Utf8               valueOf
  #29 = Utf8               (I)Ljava/lang/Integer;
  #30 = Methodref          #8.#31         // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics.getSuccessRate:()D
  #31 = NameAndType        #32:#33        // getSuccessRate:()D
  #32 = Utf8               getSuccessRate
  #33 = Utf8               ()D
  #34 = Double             100.0d
  #36 = Methodref          #37.#38        // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #37 = Class              #39            // java/lang/Double
  #38 = NameAndType        #28:#40        // valueOf:(D)Ljava/lang/Double;
  #39 = Utf8               java/lang/Double
  #40 = Utf8               (D)Ljava/lang/Double;
  #41 = Methodref          #42.#43        // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #42 = Class              #44            // java/lang/String
  #43 = NameAndType        #45:#46        // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #44 = Utf8               java/lang/String
  #45 = Utf8               format
  #46 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #47 = Utf8               (IIII)V
  #48 = Utf8               Code
  #49 = Utf8               LineNumberTable
  #50 = Utf8               LocalVariableTable
  #51 = Utf8               this
  #52 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics;
  #53 = Utf8               StackMapTable
  #54 = Utf8               toString
  #55 = Utf8               ()Ljava/lang/String;
  #56 = Utf8               SourceFile
  #57 = Utf8               PathfinderGenerator.java
  #58 = Utf8               NestHost
  #59 = Class              #60            // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator
  #60 = Utf8               ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator
  #61 = Utf8               InnerClasses
  #62 = Utf8               GenerationStatistics
{
  public final int totalWaypoints;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int totalPaths;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int generatedPaths;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final int failedPaths;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public ext.mods.gameserver.geoengine.pathfinding.PathfinderGenerator$GenerationStatistics(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field totalWaypoints:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field totalPaths:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field generatedPaths:I
        19: aload_0
        20: iload         4
        22: putfield      #19                 // Field failedPaths:I
        25: return
      LineNumberTable:
        line 381: 0
        line 382: 4
        line 383: 9
        line 384: 14
        line 385: 19
        line 386: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics;
            0      26     1 totalWaypoints   I
            0      26     2 totalPaths   I
            0      26     3 generatedPaths   I
            0      26     4 failedPaths   I

  public double getSuccessRate();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field totalPaths:I
         4: ifle          21
         7: aload_0
         8: getfield      #16                 // Field generatedPaths:I
        11: i2d
        12: aload_0
        13: getfield      #13                 // Field totalPaths:I
        16: i2d
        17: ddiv
        18: goto          22
        21: dconst_0
        22: dreturn
      LineNumberTable:
        line 389: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ double ]

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=1, args_size=1
         0: ldc           #22                 // String Generation Stats - Waypoints: %d, Total Paths: %d, Generated: %d, Failed: %d, Success Rate: %.1f%%
         2: iconst_5
         3: anewarray     #2                  // class java/lang/Object
         6: dup
         7: iconst_0
         8: aload_0
         9: getfield      #7                  // Field totalWaypoints:I
        12: invokestatic  #24                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        15: aastore
        16: dup
        17: iconst_1
        18: aload_0
        19: getfield      #13                 // Field totalPaths:I
        22: invokestatic  #24                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        25: aastore
        26: dup
        27: iconst_2
        28: aload_0
        29: getfield      #16                 // Field generatedPaths:I
        32: invokestatic  #24                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        35: aastore
        36: dup
        37: iconst_3
        38: aload_0
        39: getfield      #19                 // Field failedPaths:I
        42: invokestatic  #24                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        45: aastore
        46: dup
        47: iconst_4
        48: aload_0
        49: invokevirtual #30                 // Method getSuccessRate:()D
        52: ldc2_w        #34                 // double 100.0d
        55: dmul
        56: invokestatic  #36                 // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        59: aastore
        60: invokestatic  #41                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        63: areturn
      LineNumberTable:
        line 394: 0
        line 397: 12
        line 398: 49
        line 394: 60
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      64     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics;
}
SourceFile: "PathfinderGenerator.java"
NestHost: class ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator
InnerClasses:
  public static #62= #8 of #59;           // GenerationStatistics=class ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics of class ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator
