// Bytecode for: ext.mods.gameserver.model.records.custom.StaticSpawn
// File: ext\mods\gameserver\model\records\custom\StaticSpawn.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/custom/StaticSpawn.class
  Last modified 9 de jul de 2026; size 4688 bytes
  MD5 checksum 31f0ade05bd9e2636361361f3d530da9
  Compiled from "StaticSpawn.java"
public final class ext.mods.gameserver.model.records.custom.StaticSpawn extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/custom/StaticSpawn
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 7, methods: 17, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Record."<init>":()V
    #2 = Class              #4            // java/lang/Record
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Record
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/records/custom/StaticSpawn.isEnabled:Z
    #8 = Class              #10           // ext/mods/gameserver/model/records/custom/StaticSpawn
    #9 = NameAndType        #11:#12       // isEnabled:Z
   #10 = Utf8               ext/mods/gameserver/model/records/custom/StaticSpawn
   #11 = Utf8               isEnabled
   #12 = Utf8               Z
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/records/custom/StaticSpawn.id:I
   #14 = NameAndType        #15:#16       // id:I
   #15 = Utf8               id
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/model/records/custom/StaticSpawn.days:Ljava/util/List;
   #18 = NameAndType        #19:#20       // days:Ljava/util/List;
   #19 = Utf8               days
   #20 = Utf8               Ljava/util/List;
   #21 = Fieldref           #8.#22        // ext/mods/gameserver/model/records/custom/StaticSpawn.time:Ljava/util/List;
   #22 = NameAndType        #23:#20       // time:Ljava/util/List;
   #23 = Utf8               time
   #24 = Fieldref           #8.#25        // ext/mods/gameserver/model/records/custom/StaticSpawn.randomTime:I
   #25 = NameAndType        #26:#16       // randomTime:I
   #26 = Utf8               randomTime
   #27 = Fieldref           #8.#28        // ext/mods/gameserver/model/records/custom/StaticSpawn.earthQuake:Z
   #28 = NameAndType        #29:#12       // earthQuake:Z
   #29 = Utf8               earthQuake
   #30 = Fieldref           #8.#31        // ext/mods/gameserver/model/records/custom/StaticSpawn.announce:Z
   #31 = NameAndType        #32:#12       // announce:Z
   #32 = Utf8               announce
   #33 = String             #34           // :
   #34 = Utf8               :
   #35 = Methodref          #36.#37       // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #36 = Class              #38           // java/lang/String
   #37 = NameAndType        #39:#40       // split:(Ljava/lang/String;)[Ljava/lang/String;
   #38 = Utf8               java/lang/String
   #39 = Utf8               split
   #40 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #41 = Methodref          #42.#43       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #42 = Class              #44           // java/lang/Integer
   #43 = NameAndType        #45:#46       // parseInt:(Ljava/lang/String;)I
   #44 = Utf8               java/lang/Integer
   #45 = Utf8               parseInt
   #46 = Utf8               (Ljava/lang/String;)I
   #47 = Methodref          #36.#48       // java/lang/String.valueOf:(I)Ljava/lang/String;
   #48 = NameAndType        #49:#50       // valueOf:(I)Ljava/lang/String;
   #49 = Utf8               valueOf
   #50 = Utf8               (I)Ljava/lang/String;
   #51 = InterfaceMethodref #52.#53       // java/util/List.contains:(Ljava/lang/Object;)Z
   #52 = Class              #54           // java/util/List
   #53 = NameAndType        #55:#56       // contains:(Ljava/lang/Object;)Z
   #54 = Utf8               java/util/List
   #55 = Utf8               contains
   #56 = Utf8               (Ljava/lang/Object;)Z
   #57 = InterfaceMethodref #52.#58       // java/util/List.iterator:()Ljava/util/Iterator;
   #58 = NameAndType        #59:#60       // iterator:()Ljava/util/Iterator;
   #59 = Utf8               iterator
   #60 = Utf8               ()Ljava/util/Iterator;
   #61 = InterfaceMethodref #62.#63       // java/util/Iterator.hasNext:()Z
   #62 = Class              #64           // java/util/Iterator
   #63 = NameAndType        #65:#66       // hasNext:()Z
   #64 = Utf8               java/util/Iterator
   #65 = Utf8               hasNext
   #66 = Utf8               ()Z
   #67 = InterfaceMethodref #62.#68       // java/util/Iterator.next:()Ljava/lang/Object;
   #68 = NameAndType        #69:#70       // next:()Ljava/lang/Object;
   #69 = Utf8               next
   #70 = Utf8               ()Ljava/lang/Object;
   #71 = Methodref          #8.#72        // ext/mods/gameserver/model/records/custom/StaticSpawn.timeStringToMinutes:(Ljava/lang/String;)I
   #72 = NameAndType        #73:#46       // timeStringToMinutes:(Ljava/lang/String;)I
   #73 = Utf8               timeStringToMinutes
   #74 = InterfaceMethodref #52.#75       // java/util/List.isEmpty:()Z
   #75 = NameAndType        #76:#66       // isEmpty:()Z
   #76 = Utf8               isEmpty
   #77 = InterfaceMethodref #52.#78       // java/util/List.get:(I)Ljava/lang/Object;
   #78 = NameAndType        #79:#80       // get:(I)Ljava/lang/Object;
   #79 = Utf8               get
   #80 = Utf8               (I)Ljava/lang/Object;
   #81 = Methodref          #82.#83       // java/util/Calendar.getInstance:()Ljava/util/Calendar;
   #82 = Class              #84           // java/util/Calendar
   #83 = NameAndType        #85:#86       // getInstance:()Ljava/util/Calendar;
   #84 = Utf8               java/util/Calendar
   #85 = Utf8               getInstance
   #86 = Utf8               ()Ljava/util/Calendar;
   #87 = Methodref          #82.#88       // java/util/Calendar.get:(I)I
   #88 = NameAndType        #79:#89       // get:(I)I
   #89 = Utf8               (I)I
   #90 = Methodref          #8.#91        // ext/mods/gameserver/model/records/custom/StaticSpawn.getSpawnDayTime:(I)I
   #91 = NameAndType        #92:#89       // getSpawnDayTime:(I)I
   #92 = Utf8               getSpawnDayTime
   #93 = Methodref          #8.#94        // ext/mods/gameserver/model/records/custom/StaticSpawn.canSpawnOnSameDay:(I)Z
   #94 = NameAndType        #95:#96       // canSpawnOnSameDay:(I)Z
   #95 = Utf8               canSpawnOnSameDay
   #96 = Utf8               (I)Z
   #97 = Methodref          #82.#98       // java/util/Calendar.set:(II)V
   #98 = NameAndType        #99:#100      // set:(II)V
   #99 = Utf8               set
  #100 = Utf8               (II)V
  #101 = Methodref          #8.#102       // ext/mods/gameserver/model/records/custom/StaticSpawn.getSpawnDayWeek:(I)I
  #102 = NameAndType        #103:#89      // getSpawnDayWeek:(I)I
  #103 = Utf8               getSpawnDayWeek
  #104 = Methodref          #8.#105       // ext/mods/gameserver/model/records/custom/StaticSpawn.getFirstSpawnDayTime:()I
  #105 = NameAndType        #106:#107     // getFirstSpawnDayTime:()I
  #106 = Utf8               getFirstSpawnDayTime
  #107 = Utf8               ()I
  #108 = Methodref          #82.#109      // java/util/Calendar.add:(II)V
  #109 = NameAndType        #110:#100     // add:(II)V
  #110 = Utf8               add
  #111 = Methodref          #82.#112      // java/util/Calendar.getTimeInMillis:()J
  #112 = NameAndType        #113:#114     // getTimeInMillis:()J
  #113 = Utf8               getTimeInMillis
  #114 = Utf8               ()J
  #115 = InvokeDynamic      #0:#116       // #0:toString:(Lext/mods/gameserver/model/records/custom/StaticSpawn;)Ljava/lang/String;
  #116 = NameAndType        #117:#118     // toString:(Lext/mods/gameserver/model/records/custom/StaticSpawn;)Ljava/lang/String;
  #117 = Utf8               toString
  #118 = Utf8               (Lext/mods/gameserver/model/records/custom/StaticSpawn;)Ljava/lang/String;
  #119 = InvokeDynamic      #0:#120       // #0:hashCode:(Lext/mods/gameserver/model/records/custom/StaticSpawn;)I
  #120 = NameAndType        #121:#122     // hashCode:(Lext/mods/gameserver/model/records/custom/StaticSpawn;)I
  #121 = Utf8               hashCode
  #122 = Utf8               (Lext/mods/gameserver/model/records/custom/StaticSpawn;)I
  #123 = InvokeDynamic      #0:#124       // #0:equals:(Lext/mods/gameserver/model/records/custom/StaticSpawn;Ljava/lang/Object;)Z
  #124 = NameAndType        #125:#126     // equals:(Lext/mods/gameserver/model/records/custom/StaticSpawn;Ljava/lang/Object;)Z
  #125 = Utf8               equals
  #126 = Utf8               (Lext/mods/gameserver/model/records/custom/StaticSpawn;Ljava/lang/Object;)Z
  #127 = Utf8               Signature
  #128 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #129 = Utf8               (ZILjava/util/List;Ljava/util/List;IZZ)V
  #130 = Utf8               Code
  #131 = Utf8               LineNumberTable
  #132 = Utf8               LocalVariableTable
  #133 = Utf8               this
  #134 = Utf8               Lext/mods/gameserver/model/records/custom/StaticSpawn;
  #135 = Utf8               LocalVariableTypeTable
  #136 = Utf8               MethodParameters
  #137 = Utf8               (ZILjava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/String;>;IZZ)V
  #138 = Utf8               timeString
  #139 = Utf8               Ljava/lang/String;
  #140 = Utf8               parts
  #141 = Utf8               [Ljava/lang/String;
  #142 = Utf8               hours
  #143 = Utf8               minutes
  #144 = Utf8               dayWeek
  #145 = Utf8               t
  #146 = Utf8               dayTime
  #147 = Utf8               StackMapTable
  #148 = Utf8               i
  #149 = Utf8               index
  #150 = Utf8               calcNextDate
  #151 = Utf8               spawnDayWeek
  #152 = Utf8               deltaDay
  #153 = Utf8               cal
  #154 = Utf8               Ljava/util/Calendar;
  #155 = Utf8               cDayTime
  #156 = Utf8               curDayWeek
  #157 = Utf8               spawnDayTime
  #158 = Utf8               ()Ljava/lang/String;
  #159 = Utf8               o
  #160 = Utf8               Ljava/lang/Object;
  #161 = Utf8               ()Ljava/util/List;
  #162 = Utf8               ()Ljava/util/List<Ljava/lang/String;>;
  #163 = Utf8               SourceFile
  #164 = Utf8               StaticSpawn.java
  #165 = Utf8               Record
  #166 = Utf8               BootstrapMethods
  #167 = String             #168          // isEnabled;id;days;time;randomTime;earthQuake;announce
  #168 = Utf8               isEnabled;id;days;time;randomTime;earthQuake;announce
  #169 = MethodHandle       1:#7          // REF_getField ext/mods/gameserver/model/records/custom/StaticSpawn.isEnabled:Z
  #170 = MethodHandle       1:#13         // REF_getField ext/mods/gameserver/model/records/custom/StaticSpawn.id:I
  #171 = MethodHandle       1:#17         // REF_getField ext/mods/gameserver/model/records/custom/StaticSpawn.days:Ljava/util/List;
  #172 = MethodHandle       1:#21         // REF_getField ext/mods/gameserver/model/records/custom/StaticSpawn.time:Ljava/util/List;
  #173 = MethodHandle       1:#24         // REF_getField ext/mods/gameserver/model/records/custom/StaticSpawn.randomTime:I
  #174 = MethodHandle       1:#27         // REF_getField ext/mods/gameserver/model/records/custom/StaticSpawn.earthQuake:Z
  #175 = MethodHandle       1:#30         // REF_getField ext/mods/gameserver/model/records/custom/StaticSpawn.announce:Z
  #176 = MethodHandle       6:#177        // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #177 = Methodref          #178.#179     // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #178 = Class              #180          // java/lang/runtime/ObjectMethods
  #179 = NameAndType        #181:#182     // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #180 = Utf8               java/lang/runtime/ObjectMethods
  #181 = Utf8               bootstrap
  #182 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #183 = Utf8               InnerClasses
  #184 = Class              #185          // java/lang/invoke/MethodHandles$Lookup
  #185 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #186 = Class              #187          // java/lang/invoke/MethodHandles
  #187 = Utf8               java/lang/invoke/MethodHandles
  #188 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.custom.StaticSpawn(boolean, int, java.util.List<java.lang.String>, java.util.List<java.lang.String>, int, boolean, boolean);
    descriptor: (ZILjava/util/List;Ljava/util/List;IZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=8, args_size=8
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field isEnabled:Z
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field id:I
        14: aload_0
        15: aload_3
        16: putfield      #17                 // Field days:Ljava/util/List;
        19: aload_0
        20: aload         4
        22: putfield      #21                 // Field time:Ljava/util/List;
        25: aload_0
        26: iload         5
        28: putfield      #24                 // Field randomTime:I
        31: aload_0
        32: iload         6
        34: putfield      #27                 // Field earthQuake:Z
        37: aload_0
        38: iload         7
        40: putfield      #30                 // Field announce:Z
        43: return
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/model/records/custom/StaticSpawn;
            0      44     1 isEnabled   Z
            0      44     2    id   I
            0      44     3  days   Ljava/util/List;
            0      44     4  time   Ljava/util/List;
            0      44     5 randomTime   I
            0      44     6 earthQuake   Z
            0      44     7 announce   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      44     3  days   Ljava/util/List<Ljava/lang/String;>;
            0      44     4  time   Ljava/util/List<Ljava/lang/String;>;
    MethodParameters:
      Name                           Flags
      isEnabled
      id
      days
      time
      randomTime
      earthQuake
      announce
    Signature: #137                         // (ZILjava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/String;>;IZZ)V

  public boolean canSpawnOnSameDay(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #17                 // Field days:Ljava/util/List;
         4: iload_1
         5: invokestatic  #47                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
         8: invokeinterface #51,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        13: ireturn
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/records/custom/StaticSpawn;
            0      14     1 dayWeek   I

  public int getSpawnDayTime(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=2
         0: aload_0
         1: getfield      #21                 // Field time:Ljava/util/List;
         4: invokeinterface #57,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #61,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          48
        19: aload_2
        20: invokeinterface #67,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #36                 // class java/lang/String
        28: astore_3
        29: aload_0
        30: aload_3
        31: invokevirtual #71                 // Method timeStringToMinutes:(Ljava/lang/String;)I
        34: istore        4
        36: iload         4
        38: iload_1
        39: if_icmple     45
        42: iload         4
        44: ireturn
        45: goto          10
        48: iconst_m1
        49: ireturn
      LineNumberTable:
        line 40: 0
        line 42: 29
        line 43: 36
        line 44: 42
        line 45: 45
        line 46: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           36       9     4 minutes   I
           29      16     3     t   Ljava/lang/String;
            0      50     0  this   Lext/mods/gameserver/model/records/custom/StaticSpawn;
            0      50     1 dayTime   I
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 34 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public int getFirstSpawnDayTime();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field time:Ljava/util/List;
         4: invokeinterface #74,  1           // InterfaceMethod java/util/List.isEmpty:()Z
         9: ifeq          16
        12: iconst_m1
        13: goto          33
        16: aload_0
        17: aload_0
        18: getfield      #21                 // Field time:Ljava/util/List;
        21: iconst_0
        22: invokeinterface #77,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        27: checkcast     #36                 // class java/lang/String
        30: invokevirtual #71                 // Method timeStringToMinutes:(Ljava/lang/String;)I
        33: ireturn
      LineNumberTable:
        line 51: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/model/records/custom/StaticSpawn;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 80 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getSpawnDayWeek(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: iload_1
         1: bipush        7
         3: irem
         4: istore_2
         5: iconst_0
         6: istore_3
         7: iload_3
         8: bipush        7
        10: if_icmpge     48
        13: aload_0
        14: getfield      #17                 // Field days:Ljava/util/List;
        17: iload_2
        18: iconst_1
        19: iadd
        20: invokestatic  #47                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
        23: invokeinterface #51,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        28: ifeq          35
        31: iload_2
        32: iconst_1
        33: iadd
        34: ireturn
        35: iload_2
        36: iconst_1
        37: iadd
        38: bipush        7
        40: irem
        41: istore_2
        42: iinc          3, 1
        45: goto          7
        48: iconst_m1
        49: ireturn
      LineNumberTable:
        line 56: 0
        line 57: 5
        line 59: 13
        line 60: 31
        line 62: 35
        line 57: 42
        line 64: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            7      41     3     i   I
            0      50     0  this   Lext/mods/gameserver/model/records/custom/StaticSpawn;
            0      50     1 dayWeek   I
            5      45     2 index   I
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 7
          locals = [ int, int ]
        frame_type = 27 /* same */
        frame_type = 250 /* chop */
          offset_delta = 12

  public long calcNextDate();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=1
         0: invokestatic  #81                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
         3: astore_1
         4: aload_1
         5: bipush        11
         7: invokevirtual #87                 // Method java/util/Calendar.get:(I)I
        10: bipush        60
        12: imul
        13: aload_1
        14: bipush        12
        16: invokevirtual #87                 // Method java/util/Calendar.get:(I)I
        19: iadd
        20: istore_2
        21: aload_1
        22: bipush        7
        24: invokevirtual #87                 // Method java/util/Calendar.get:(I)I
        27: istore_3
        28: aload_0
        29: iload_2
        30: invokevirtual #90                 // Method getSpawnDayTime:(I)I
        33: istore        4
        35: iload         4
        37: iconst_m1
        38: if_icmpeq     81
        41: aload_0
        42: iload_3
        43: invokevirtual #93                 // Method canSpawnOnSameDay:(I)Z
        46: ifeq          81
        49: aload_1
        50: bipush        11
        52: iload         4
        54: bipush        60
        56: idiv
        57: invokevirtual #97                 // Method java/util/Calendar.set:(II)V
        60: aload_1
        61: bipush        12
        63: iload         4
        65: bipush        60
        67: irem
        68: invokevirtual #97                 // Method java/util/Calendar.set:(II)V
        71: aload_1
        72: bipush        13
        74: iconst_0
        75: invokevirtual #97                 // Method java/util/Calendar.set:(II)V
        78: goto          170
        81: aload_0
        82: iload_3
        83: invokevirtual #101                // Method getSpawnDayWeek:(I)I
        86: istore        5
        88: iconst_0
        89: istore        6
        91: iload_3
        92: iload         5
        94: if_icmple     109
        97: bipush        7
        99: iload_3
       100: isub
       101: iload         5
       103: iadd
       104: istore        6
       106: goto          128
       109: iload_3
       110: iload         5
       112: if_icmpge     124
       115: iload         5
       117: iload_3
       118: isub
       119: istore        6
       121: goto          128
       124: bipush        7
       126: istore        6
       128: aload_0
       129: invokevirtual #104                // Method getFirstSpawnDayTime:()I
       132: istore        4
       134: aload_1
       135: iconst_5
       136: iload         6
       138: invokevirtual #108                // Method java/util/Calendar.add:(II)V
       141: aload_1
       142: bipush        11
       144: iload         4
       146: bipush        60
       148: idiv
       149: invokevirtual #97                 // Method java/util/Calendar.set:(II)V
       152: aload_1
       153: bipush        12
       155: iload         4
       157: bipush        60
       159: irem
       160: invokevirtual #97                 // Method java/util/Calendar.set:(II)V
       163: aload_1
       164: bipush        13
       166: iconst_0
       167: invokevirtual #97                 // Method java/util/Calendar.set:(II)V
       170: aload_1
       171: invokevirtual #111                // Method java/util/Calendar.getTimeInMillis:()J
       174: lreturn
      LineNumberTable:
        line 69: 0
        line 70: 4
        line 71: 21
        line 72: 28
        line 73: 35
        line 75: 49
        line 76: 60
        line 77: 71
        line 81: 81
        line 82: 88
        line 83: 91
        line 84: 97
        line 85: 109
        line 86: 115
        line 88: 124
        line 90: 128
        line 91: 134
        line 92: 141
        line 93: 152
        line 94: 163
        line 96: 170
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           88      82     5 spawnDayWeek   I
           91      79     6 deltaDay   I
            0     175     0  this   Lext/mods/gameserver/model/records/custom/StaticSpawn;
            4     171     1   cal   Ljava/util/Calendar;
           21     154     2 cDayTime   I
           28     147     3 curDayWeek   I
           35     140     4 spawnDayTime   I
      StackMapTable: number_of_entries = 5
        frame_type = 255 /* full_frame */
          offset_delta = 81
          locals = [ class ext/mods/gameserver/model/records/custom/StaticSpawn, class java/util/Calendar, int, int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 27
          locals = [ int, int ]
        frame_type = 14 /* same */
        frame_type = 3 /* same */
        frame_type = 249 /* chop */
          offset_delta = 41

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #115,  0            // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/custom/StaticSpawn;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/custom/StaticSpawn;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #119,  0            // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/custom/StaticSpawn;)I
         6: ireturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/custom/StaticSpawn;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #123,  0            // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/custom/StaticSpawn;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/custom/StaticSpawn;
            0       8     1     o   Ljava/lang/Object;

  public boolean isEnabled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field isEnabled:Z
         4: ireturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/StaticSpawn;

  public int id();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field id:I
         4: ireturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/StaticSpawn;

  public java.util.List<java.lang.String> days();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field days:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/StaticSpawn;
    Signature: #162                         // ()Ljava/util/List<Ljava/lang/String;>;

  public java.util.List<java.lang.String> time();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field time:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/StaticSpawn;
    Signature: #162                         // ()Ljava/util/List<Ljava/lang/String;>;

  public int randomTime();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field randomTime:I
         4: ireturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/StaticSpawn;

  public boolean earthQuake();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field earthQuake:Z
         4: ireturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/StaticSpawn;

  public boolean announce();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field announce:Z
         4: ireturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/StaticSpawn;
}
SourceFile: "StaticSpawn.java"
  Record: length = 0x3C (unknown attribute)
   00 07 00 0B 00 0C 00 00 00 0F 00 10 00 00 00 13
   00 14 00 01 00 7F 00 00 00 02 00 80 00 17 00 14
   00 01 00 7F 00 00 00 02 00 80 00 1A 00 10 00 00
   00 1D 00 0C 00 00 00 20 00 0C 00 00
BootstrapMethods:
  0: #176 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/custom/StaticSpawn
      #167 isEnabled;id;days;time;randomTime;earthQuake;announce
      #169 REF_getField ext/mods/gameserver/model/records/custom/StaticSpawn.isEnabled:Z
      #170 REF_getField ext/mods/gameserver/model/records/custom/StaticSpawn.id:I
      #171 REF_getField ext/mods/gameserver/model/records/custom/StaticSpawn.days:Ljava/util/List;
      #172 REF_getField ext/mods/gameserver/model/records/custom/StaticSpawn.time:Ljava/util/List;
      #173 REF_getField ext/mods/gameserver/model/records/custom/StaticSpawn.randomTime:I
      #174 REF_getField ext/mods/gameserver/model/records/custom/StaticSpawn.earthQuake:Z
      #175 REF_getField ext/mods/gameserver/model/records/custom/StaticSpawn.announce:Z
InnerClasses:
  public static final #188= #184 of #186; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
