// Bytecode for: ext.mods.gameserver.enums.boats.BoatSound
// File: ext\mods\gameserver\enums\boats\BoatSound.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/boats/BoatSound.class
  Last modified 9 de jul de 2026; size 1832 bytes
  MD5 checksum f02f25dcb63373ba33a9d3d434e9e7be
  Compiled from "BoatSound.java"
public final class ext.mods.gameserver.enums.boats.BoatSound extends java.lang.Enum<ext.mods.gameserver.enums.boats.BoatSound>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/boats/BoatSound
  super_class: #23                        // java/lang/Enum
  interfaces: 0, fields: 5, methods: 6, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/boats/BoatSound
   #2 = Utf8               ext/mods/gameserver/enums/boats/BoatSound
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/boats/BoatSound.ARRIVAL_DEPARTURE:Lext/mods/gameserver/enums/boats/BoatSound;
   #4 = NameAndType        #5:#6          // ARRIVAL_DEPARTURE:Lext/mods/gameserver/enums/boats/BoatSound;
   #5 = Utf8               ARRIVAL_DEPARTURE
   #6 = Utf8               Lext/mods/gameserver/enums/boats/BoatSound;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/boats/BoatSound.LEAVE_5_MIN:Lext/mods/gameserver/enums/boats/BoatSound;
   #8 = NameAndType        #9:#6          // LEAVE_5_MIN:Lext/mods/gameserver/enums/boats/BoatSound;
   #9 = Utf8               LEAVE_5_MIN
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/boats/BoatSound.LEAVE_1_MIN:Lext/mods/gameserver/enums/boats/BoatSound;
  #11 = NameAndType        #12:#6         // LEAVE_1_MIN:Lext/mods/gameserver/enums/boats/BoatSound;
  #12 = Utf8               LEAVE_1_MIN
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/boats/BoatSound.$VALUES:[Lext/mods/gameserver/enums/boats/BoatSound;
  #14 = NameAndType        #15:#16        // $VALUES:[Lext/mods/gameserver/enums/boats/BoatSound;
  #15 = Utf8               $VALUES
  #16 = Utf8               [Lext/mods/gameserver/enums/boats/BoatSound;
  #17 = Methodref          #18.#19        // "[Lext/mods/gameserver/enums/boats/BoatSound;".clone:()Ljava/lang/Object;
  #18 = Class              #16            // "[Lext/mods/gameserver/enums/boats/BoatSound;"
  #19 = NameAndType        #20:#21        // clone:()Ljava/lang/Object;
  #20 = Utf8               clone
  #21 = Utf8               ()Ljava/lang/Object;
  #22 = Methodref          #23.#24        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #23 = Class              #25            // java/lang/Enum
  #24 = NameAndType        #26:#27        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #25 = Utf8               java/lang/Enum
  #26 = Utf8               valueOf
  #27 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #28 = Methodref          #23.#29        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #29 = NameAndType        #30:#31        // "<init>":(Ljava/lang/String;I)V
  #30 = Utf8               <init>
  #31 = Utf8               (Ljava/lang/String;I)V
  #32 = Fieldref           #1.#33         // ext/mods/gameserver/enums/boats/BoatSound._sound:Ljava/lang/String;
  #33 = NameAndType        #34:#35        // _sound:Ljava/lang/String;
  #34 = Utf8               _sound
  #35 = Utf8               Ljava/lang/String;
  #36 = Class              #37            // ext/mods/gameserver/network/serverpackets/PlaySound
  #37 = Utf8               ext/mods/gameserver/network/serverpackets/PlaySound
  #38 = Methodref          #36.#39        // ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(ILjava/lang/String;Lext/mods/gameserver/model/WorldObject;)V
  #39 = NameAndType        #30:#40        // "<init>":(ILjava/lang/String;Lext/mods/gameserver/model/WorldObject;)V
  #40 = Utf8               (ILjava/lang/String;Lext/mods/gameserver/model/WorldObject;)V
  #41 = String             #5             // ARRIVAL_DEPARTURE
  #42 = String             #43            // itemsound.ship_arrival_departure
  #43 = Utf8               itemsound.ship_arrival_departure
  #44 = Methodref          #1.#45         // ext/mods/gameserver/enums/boats/BoatSound."<init>":(Ljava/lang/String;ILjava/lang/String;)V
  #45 = NameAndType        #30:#46        // "<init>":(Ljava/lang/String;ILjava/lang/String;)V
  #46 = Utf8               (Ljava/lang/String;ILjava/lang/String;)V
  #47 = String             #9             // LEAVE_5_MIN
  #48 = String             #49            // itemsound.ship_5min
  #49 = Utf8               itemsound.ship_5min
  #50 = String             #12            // LEAVE_1_MIN
  #51 = String             #52            // itemsound.ship_1min
  #52 = Utf8               itemsound.ship_1min
  #53 = Methodref          #1.#54         // ext/mods/gameserver/enums/boats/BoatSound.$values:()[Lext/mods/gameserver/enums/boats/BoatSound;
  #54 = NameAndType        #55:#56        // $values:()[Lext/mods/gameserver/enums/boats/BoatSound;
  #55 = Utf8               $values
  #56 = Utf8               ()[Lext/mods/gameserver/enums/boats/BoatSound;
  #57 = Utf8               values
  #58 = Utf8               Code
  #59 = Utf8               LineNumberTable
  #60 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/boats/BoatSound;
  #61 = Utf8               LocalVariableTable
  #62 = Utf8               name
  #63 = Utf8               MethodParameters
  #64 = Utf8               this
  #65 = Utf8               sound
  #66 = Utf8               Signature
  #67 = Utf8               (Ljava/lang/String;)V
  #68 = Utf8               get
  #69 = Utf8               (Lext/mods/gameserver/model/actor/Boat;)Lext/mods/gameserver/network/serverpackets/PlaySound;
  #70 = Utf8               boat
  #71 = Utf8               Lext/mods/gameserver/model/actor/Boat;
  #72 = Utf8               <clinit>
  #73 = Utf8               ()V
  #74 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/boats/BoatSound;>;
  #75 = Utf8               SourceFile
  #76 = Utf8               BoatSound.java
{
  public static final ext.mods.gameserver.enums.boats.BoatSound ARRIVAL_DEPARTURE;
    descriptor: Lext/mods/gameserver/enums/boats/BoatSound;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.boats.BoatSound LEAVE_5_MIN;
    descriptor: Lext/mods/gameserver/enums/boats/BoatSound;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.boats.BoatSound LEAVE_1_MIN;
    descriptor: Lext/mods/gameserver/enums/boats/BoatSound;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.boats.BoatSound[] values();
    descriptor: ()[Lext/mods/gameserver/enums/boats/BoatSound;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #13                 // Field $VALUES:[Lext/mods/gameserver/enums/boats/BoatSound;
         3: invokevirtual #17                 // Method "[Lext/mods/gameserver/enums/boats/BoatSound;".clone:()Ljava/lang/Object;
         6: checkcast     #18                 // class "[Lext/mods/gameserver/enums/boats/BoatSound;"
         9: areturn
      LineNumberTable:
        line 23: 0

  public static ext.mods.gameserver.enums.boats.BoatSound valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/boats/BoatSound;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/boats/BoatSound
         2: aload_0
         3: invokestatic  #22                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/boats/BoatSound
         9: areturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public ext.mods.gameserver.network.serverpackets.PlaySound get(ext.mods.gameserver.model.actor.Boat);
    descriptor: (Lext/mods/gameserver/model/actor/Boat;)Lext/mods/gameserver/network/serverpackets/PlaySound;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: new           #36                 // class ext/mods/gameserver/network/serverpackets/PlaySound
         3: dup
         4: iconst_0
         5: aload_0
         6: getfield      #32                 // Field _sound:Ljava/lang/String;
         9: aload_1
        10: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(ILjava/lang/String;Lext/mods/gameserver/model/WorldObject;)V
        13: areturn
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/enums/boats/BoatSound;
            0      14     1  boat   Lext/mods/gameserver/model/actor/Boat;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/boats/BoatSound
         3: dup
         4: ldc           #41                 // String ARRIVAL_DEPARTURE
         6: iconst_0
         7: ldc           #42                 // String itemsound.ship_arrival_departure
         9: invokespecial #44                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
        12: putstatic     #3                  // Field ARRIVAL_DEPARTURE:Lext/mods/gameserver/enums/boats/BoatSound;
        15: new           #1                  // class ext/mods/gameserver/enums/boats/BoatSound
        18: dup
        19: ldc           #47                 // String LEAVE_5_MIN
        21: iconst_1
        22: ldc           #48                 // String itemsound.ship_5min
        24: invokespecial #44                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
        27: putstatic     #7                  // Field LEAVE_5_MIN:Lext/mods/gameserver/enums/boats/BoatSound;
        30: new           #1                  // class ext/mods/gameserver/enums/boats/BoatSound
        33: dup
        34: ldc           #50                 // String LEAVE_1_MIN
        36: iconst_2
        37: ldc           #51                 // String itemsound.ship_1min
        39: invokespecial #44                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
        42: putstatic     #10                 // Field LEAVE_1_MIN:Lext/mods/gameserver/enums/boats/BoatSound;
        45: invokestatic  #53                 // Method $values:()[Lext/mods/gameserver/enums/boats/BoatSound;
        48: putstatic     #13                 // Field $VALUES:[Lext/mods/gameserver/enums/boats/BoatSound;
        51: return
      LineNumberTable:
        line 25: 0
        line 26: 15
        line 27: 30
        line 23: 45
}
Signature: #74                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/boats/BoatSound;>;
SourceFile: "BoatSound.java"
