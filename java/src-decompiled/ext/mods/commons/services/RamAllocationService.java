// Bytecode for: ext.mods.commons.services.RamAllocationService
// File: ext\mods\commons\services\RamAllocationService.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/services/RamAllocationService.class
  Last modified 9 de jul de 2026; size 4473 bytes
  MD5 checksum b0a1c64d863c3d6aef9c9426393b08bc
  Compiled from "RamAllocationService.java"
public class ext.mods.commons.services.RamAllocationService implements ext.mods.commons.services.IRamAllocationService
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/commons/services/RamAllocationService
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 7, methods: 16, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/commons/services/RamAllocationService.determineTotalPhysicalMemoryGB:()I
    #8 = Class              #10           // ext/mods/commons/services/RamAllocationService
    #9 = NameAndType        #11:#12       // determineTotalPhysicalMemoryGB:()I
   #10 = Utf8               ext/mods/commons/services/RamAllocationService
   #11 = Utf8               determineTotalPhysicalMemoryGB
   #12 = Utf8               ()I
   #13 = Fieldref           #8.#14        // ext/mods/commons/services/RamAllocationService.totalPhysicalMemoryGB:I
   #14 = NameAndType        #15:#16       // totalPhysicalMemoryGB:I
   #15 = Utf8               totalPhysicalMemoryGB
   #16 = Utf8               I
   #17 = Methodref          #8.#18        // ext/mods/commons/services/RamAllocationService.determineAvailablePhysicalMemoryGB:()I
   #18 = NameAndType        #19:#12       // determineAvailablePhysicalMemoryGB:()I
   #19 = Utf8               determineAvailablePhysicalMemoryGB
   #20 = Fieldref           #8.#21        // ext/mods/commons/services/RamAllocationService.availablePhysicalMemoryGB:I
   #21 = NameAndType        #22:#16       // availablePhysicalMemoryGB:I
   #22 = Utf8               availablePhysicalMemoryGB
   #23 = Fieldref           #8.#24        // ext/mods/commons/services/RamAllocationService.prefs:Ljava/util/prefs/Preferences;
   #24 = NameAndType        #25:#26       // prefs:Ljava/util/prefs/Preferences;
   #25 = Utf8               prefs
   #26 = Utf8               Ljava/util/prefs/Preferences;
   #27 = String             #28           // gsMemoryMB
   #28 = Utf8               gsMemoryMB
   #29 = Methodref          #30.#31       // java/util/prefs/Preferences.getInt:(Ljava/lang/String;I)I
   #30 = Class              #32           // java/util/prefs/Preferences
   #31 = NameAndType        #33:#34       // getInt:(Ljava/lang/String;I)I
   #32 = Utf8               java/util/prefs/Preferences
   #33 = Utf8               getInt
   #34 = Utf8               (Ljava/lang/String;I)I
   #35 = String             #36           // lsMemoryMB
   #36 = Utf8               lsMemoryMB
   #37 = Methodref          #8.#38        // ext/mods/commons/services/RamAllocationService.validateAndApplyAllocation:(II)V
   #38 = NameAndType        #39:#40       // validateAndApplyAllocation:(II)V
   #39 = Utf8               validateAndApplyAllocation
   #40 = Utf8               (II)V
   #41 = Long               1024l
   #43 = Methodref          #44.#45       // java/lang/Math.max:(II)I
   #44 = Class              #46           // java/lang/Math
   #45 = NameAndType        #47:#48       // max:(II)I
   #46 = Utf8               java/lang/Math
   #47 = Utf8               max
   #48 = Utf8               (II)I
   #49 = Fieldref           #8.#50        // ext/mods/commons/services/RamAllocationService.currentGsMemoryMB:I
   #50 = NameAndType        #51:#16       // currentGsMemoryMB:I
   #51 = Utf8               currentGsMemoryMB
   #52 = Fieldref           #8.#53        // ext/mods/commons/services/RamAllocationService.currentLsMemoryMB:I
   #53 = NameAndType        #54:#16       // currentLsMemoryMB:I
   #54 = Utf8               currentLsMemoryMB
   #55 = Methodref          #8.#56        // ext/mods/commons/services/RamAllocationService.saveConfigurations:()V
   #56 = NameAndType        #57:#6        // saveConfigurations:()V
   #57 = Utf8               saveConfigurations
   #58 = Class              #59           // com/sun/management/OperatingSystemMXBean
   #59 = Utf8               com/sun/management/OperatingSystemMXBean
   #60 = Methodref          #61.#62       // java/lang/management/ManagementFactory.getPlatformMXBean:(Ljava/lang/Class;)Ljava/lang/management/PlatformManagedObject;
   #61 = Class              #63           // java/lang/management/ManagementFactory
   #62 = NameAndType        #64:#65       // getPlatformMXBean:(Ljava/lang/Class;)Ljava/lang/management/PlatformManagedObject;
   #63 = Utf8               java/lang/management/ManagementFactory
   #64 = Utf8               getPlatformMXBean
   #65 = Utf8               (Ljava/lang/Class;)Ljava/lang/management/PlatformManagedObject;
   #66 = InterfaceMethodref #58.#67       // com/sun/management/OperatingSystemMXBean.getTotalPhysicalMemorySize:()J
   #67 = NameAndType        #68:#69       // getTotalPhysicalMemorySize:()J
   #68 = Utf8               getTotalPhysicalMemorySize
   #69 = Utf8               ()J
   #70 = Long               1073741824l
   #72 = InterfaceMethodref #58.#73       // com/sun/management/OperatingSystemMXBean.getFreePhysicalMemorySize:()J
   #73 = NameAndType        #74:#69       // getFreePhysicalMemorySize:()J
   #74 = Utf8               getFreePhysicalMemorySize
   #75 = Double             1.073741824E9d
   #77 = Methodref          #44.#78       // java/lang/Math.ceil:(D)D
   #78 = NameAndType        #79:#80       // ceil:(D)D
   #79 = Utf8               ceil
   #80 = Utf8               (D)D
   #81 = Methodref          #30.#82       // java/util/prefs/Preferences.putInt:(Ljava/lang/String;I)V
   #82 = NameAndType        #83:#84       // putInt:(Ljava/lang/String;I)V
   #83 = Utf8               putInt
   #84 = Utf8               (Ljava/lang/String;I)V
   #85 = InvokeDynamic      #0:#86        // #0:run:(Lext/mods/commons/services/RamAllocationService;Ljava/lang/Runnable;)Ljava/lang/Runnable;
   #86 = NameAndType        #87:#88       // run:(Lext/mods/commons/services/RamAllocationService;Ljava/lang/Runnable;)Ljava/lang/Runnable;
   #87 = Utf8               run
   #88 = Utf8               (Lext/mods/commons/services/RamAllocationService;Ljava/lang/Runnable;)Ljava/lang/Runnable;
   #89 = Long               1000l
   #91 = Methodref          #92.#93       // ext/mods/commons/pool/CoroutinePool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #92 = Class              #94           // ext/mods/commons/pool/CoroutinePool
   #93 = NameAndType        #95:#96       // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #94 = Utf8               ext/mods/commons/pool/CoroutinePool
   #95 = Utf8               scheduleAtFixedRate
   #96 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #97 = InterfaceMethodref #98.#99       // java/lang/Runnable.run:()V
   #98 = Class              #100          // java/lang/Runnable
   #99 = NameAndType        #87:#6        // run:()V
  #100 = Utf8               java/lang/Runnable
  #101 = Class              #102          // java/lang/Exception
  #102 = Utf8               java/lang/Exception
  #103 = Methodref          #101.#104     // java/lang/Exception.printStackTrace:()V
  #104 = NameAndType        #105:#6       // printStackTrace:()V
  #105 = Utf8               printStackTrace
  #106 = Methodref          #30.#107      // java/util/prefs/Preferences.userRoot:()Ljava/util/prefs/Preferences;
  #107 = NameAndType        #108:#109     // userRoot:()Ljava/util/prefs/Preferences;
  #108 = Utf8               userRoot
  #109 = Utf8               ()Ljava/util/prefs/Preferences;
  #110 = String             #111          // ram_allocation_settings
  #111 = Utf8               ram_allocation_settings
  #112 = Methodref          #30.#113      // java/util/prefs/Preferences.node:(Ljava/lang/String;)Ljava/util/prefs/Preferences;
  #113 = NameAndType        #114:#115     // node:(Ljava/lang/String;)Ljava/util/prefs/Preferences;
  #114 = Utf8               node
  #115 = Utf8               (Ljava/lang/String;)Ljava/util/prefs/Preferences;
  #116 = Class              #117          // ext/mods/commons/services/IRamAllocationService
  #117 = Utf8               ext/mods/commons/services/IRamAllocationService
  #118 = Utf8               MIN_GS_MB
  #119 = Utf8               ConstantValue
  #120 = Integer            1024
  #121 = Utf8               MIN_LS_MB
  #122 = Integer            128
  #123 = Utf8               Code
  #124 = Utf8               LineNumberTable
  #125 = Utf8               LocalVariableTable
  #126 = Utf8               this
  #127 = Utf8               Lext/mods/commons/services/RamAllocationService;
  #128 = Utf8               savedGs
  #129 = Utf8               savedLs
  #130 = Utf8               targetGs
  #131 = Utf8               targetLs
  #132 = Utf8               availableMB
  #133 = Utf8               J
  #134 = Utf8               StackMapTable
  #135 = Utf8               osBean
  #136 = Utf8               Lcom/sun/management/OperatingSystemMXBean;
  #137 = Utf8               freeGB
  #138 = Utf8               D
  #139 = Utf8               getGsMemoryMB
  #140 = Utf8               setGsMemoryMB
  #141 = Utf8               (I)Z
  #142 = Utf8               value
  #143 = Utf8               maxAvailableMB
  #144 = Utf8               getLsMemoryMB
  #145 = Utf8               setLsMemoryMB
  #146 = Utf8               getTotalPhysicalMemoryGB
  #147 = Utf8               getAvailablePhysicalMemoryGB
  #148 = Utf8               getTotalMemoryMB
  #149 = Utf8               startMemoryMonitoring
  #150 = Utf8               (Ljava/lang/Runnable;)V
  #151 = Utf8               onUpdate
  #152 = Utf8               Ljava/lang/Runnable;
  #153 = Utf8               stopMemoryMonitoring
  #154 = Utf8               lambda$startMemoryMonitoring$0
  #155 = Utf8               newAvailableGB
  #156 = Utf8               e
  #157 = Utf8               Ljava/lang/Exception;
  #158 = Utf8               <clinit>
  #159 = Utf8               SourceFile
  #160 = Utf8               RamAllocationService.java
  #161 = Utf8               BootstrapMethods
  #162 = MethodType         #6            //  ()V
  #163 = MethodHandle       5:#164        // REF_invokeVirtual ext/mods/commons/services/RamAllocationService.lambda$startMemoryMonitoring$0:(Ljava/lang/Runnable;)V
  #164 = Methodref          #8.#165       // ext/mods/commons/services/RamAllocationService.lambda$startMemoryMonitoring$0:(Ljava/lang/Runnable;)V
  #165 = NameAndType        #154:#150     // lambda$startMemoryMonitoring$0:(Ljava/lang/Runnable;)V
  #166 = MethodHandle       6:#167        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #167 = Methodref          #168.#169     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #168 = Class              #170          // java/lang/invoke/LambdaMetafactory
  #169 = NameAndType        #171:#172     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #170 = Utf8               java/lang/invoke/LambdaMetafactory
  #171 = Utf8               metafactory
  #172 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #173 = Utf8               InnerClasses
  #174 = Class              #175          // java/lang/invoke/MethodHandles$Lookup
  #175 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #176 = Class              #177          // java/lang/invoke/MethodHandles
  #177 = Utf8               java/lang/invoke/MethodHandles
  #178 = Utf8               Lookup
{
  public ext.mods.commons.services.RamAllocationService();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_0
         6: invokevirtual #7                  // Method determineTotalPhysicalMemoryGB:()I
         9: putfield      #13                 // Field totalPhysicalMemoryGB:I
        12: aload_0
        13: aload_0
        14: invokevirtual #17                 // Method determineAvailablePhysicalMemoryGB:()I
        17: putfield      #20                 // Field availablePhysicalMemoryGB:I
        20: getstatic     #23                 // Field prefs:Ljava/util/prefs/Preferences;
        23: ldc           #27                 // String gsMemoryMB
        25: sipush        2048
        28: invokevirtual #29                 // Method java/util/prefs/Preferences.getInt:(Ljava/lang/String;I)I
        31: istore_1
        32: getstatic     #23                 // Field prefs:Ljava/util/prefs/Preferences;
        35: ldc           #35                 // String lsMemoryMB
        37: sipush        512
        40: invokevirtual #29                 // Method java/util/prefs/Preferences.getInt:(Ljava/lang/String;I)I
        43: istore_2
        44: aload_0
        45: iload_1
        46: iload_2
        47: invokevirtual #37                 // Method validateAndApplyAllocation:(II)V
        50: return
      LineNumberTable:
        line 40: 0
        line 41: 4
        line 42: 12
        line 44: 20
        line 45: 32
        line 47: 44
        line 48: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      51     0  this   Lext/mods/commons/services/RamAllocationService;
           32      19     1 savedGs   I
           44       7     2 savedLs   I

  public int getGsMemoryMB();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #49                 // Field currentGsMemoryMB:I
         4: ireturn
      LineNumberTable:
        line 88: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/services/RamAllocationService;

  public boolean setGsMemoryMB(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: getfield      #20                 // Field availablePhysicalMemoryGB:I
         4: i2l
         5: ldc2_w        #41                 // long 1024l
         8: lmul
         9: lstore_2
        10: iload_1
        11: sipush        1024
        14: if_icmplt     40
        17: iload_1
        18: aload_0
        19: getfield      #52                 // Field currentLsMemoryMB:I
        22: iadd
        23: i2l
        24: lload_2
        25: lcmp
        26: ifgt          40
        29: aload_0
        30: iload_1
        31: putfield      #49                 // Field currentGsMemoryMB:I
        34: aload_0
        35: invokevirtual #55                 // Method saveConfigurations:()V
        38: iconst_1
        39: ireturn
        40: iconst_0
        41: ireturn
      LineNumberTable:
        line 92: 0
        line 94: 10
        line 95: 29
        line 96: 34
        line 97: 38
        line 99: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0  this   Lext/mods/commons/services/RamAllocationService;
            0      42     1 value   I
           10      32     2 maxAvailableMB   J
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ long ]

  public int getLsMemoryMB();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #52                 // Field currentLsMemoryMB:I
         4: ireturn
      LineNumberTable:
        line 102: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/services/RamAllocationService;

  public boolean setLsMemoryMB(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: getfield      #20                 // Field availablePhysicalMemoryGB:I
         4: i2l
         5: ldc2_w        #41                 // long 1024l
         8: lmul
         9: lstore_2
        10: iload_1
        11: sipush        128
        14: if_icmplt     40
        17: iload_1
        18: aload_0
        19: getfield      #49                 // Field currentGsMemoryMB:I
        22: iadd
        23: i2l
        24: lload_2
        25: lcmp
        26: ifgt          40
        29: aload_0
        30: iload_1
        31: putfield      #52                 // Field currentLsMemoryMB:I
        34: aload_0
        35: invokevirtual #55                 // Method saveConfigurations:()V
        38: iconst_1
        39: ireturn
        40: iconst_0
        41: ireturn
      LineNumberTable:
        line 106: 0
        line 108: 10
        line 109: 29
        line 110: 34
        line 111: 38
        line 113: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0  this   Lext/mods/commons/services/RamAllocationService;
            0      42     1 value   I
           10      32     2 maxAvailableMB   J
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ long ]

  public int getTotalPhysicalMemoryGB();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field totalPhysicalMemoryGB:I
         4: ireturn
      LineNumberTable:
        line 116: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/services/RamAllocationService;

  public int getAvailablePhysicalMemoryGB();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field availablePhysicalMemoryGB:I
         4: ireturn
      LineNumberTable:
        line 117: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/services/RamAllocationService;

  public int getTotalMemoryMB();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #49                 // Field currentGsMemoryMB:I
         4: aload_0
         5: getfield      #52                 // Field currentLsMemoryMB:I
         8: iadd
         9: ireturn
      LineNumberTable:
        line 118: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/services/RamAllocationService;

  public void startMemoryMonitoring(java.lang.Runnable);
    descriptor: (Ljava/lang/Runnable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #85,  0             // InvokeDynamic #0:run:(Lext/mods/commons/services/RamAllocationService;Ljava/lang/Runnable;)Ljava/lang/Runnable;
         7: lconst_0
         8: ldc2_w        #89                 // long 1000l
        11: invokestatic  #91                 // Method ext/mods/commons/pool/CoroutinePool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        14: pop
        15: return
      LineNumberTable:
        line 129: 0
        line 146: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/commons/services/RamAllocationService;
            0      16     1 onUpdate   Ljava/lang/Runnable;

  public void stopMemoryMonitoring();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 150: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/commons/services/RamAllocationService;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: invokestatic  #106                // Method java/util/prefs/Preferences.userRoot:()Ljava/util/prefs/Preferences;
         3: ldc           #110                // String ram_allocation_settings
         5: invokevirtual #112                // Method java/util/prefs/Preferences.node:(Ljava/lang/String;)Ljava/util/prefs/Preferences;
         8: putstatic     #23                 // Field prefs:Ljava/util/prefs/Preferences;
        11: return
      LineNumberTable:
        line 29: 0
}
SourceFile: "RamAllocationService.java"
BootstrapMethods:
  0: #166 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #162 ()V
      #163 REF_invokeVirtual ext/mods/commons/services/RamAllocationService.lambda$startMemoryMonitoring$0:(Ljava/lang/Runnable;)V
      #162 ()V
InnerClasses:
  public static final #178= #174 of #176; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
