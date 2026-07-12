// Bytecode for: ext.mods.gameserver.model.zone.type.TownZone
// File: ext\mods\gameserver\model\zone\type\TownZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/TownZone.class
  Last modified 9 de jul de 2026; size 1808 bytes
  MD5 checksum 9cd7f658182edc81a54cd883aac841f5
  Compiled from "TownZone.java"
public class ext.mods.gameserver.model.zone.type.TownZone extends ext.mods.gameserver.model.zone.type.subtype.ZoneType
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/zone/type/TownZone
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  interfaces: 0, fields: 3, methods: 6, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
   #2 = Class              #4             // ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #3 = NameAndType        #5:#6          // "<init>":(I)V
   #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #5 = Utf8               <init>
   #6 = Utf8               (I)V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/zone/type/TownZone._isPeaceZone:Z
   #8 = Class              #10            // ext/mods/gameserver/model/zone/type/TownZone
   #9 = NameAndType        #11:#12        // _isPeaceZone:Z
  #10 = Utf8               ext/mods/gameserver/model/zone/type/TownZone
  #11 = Utf8               _isPeaceZone
  #12 = Utf8               Z
  #13 = String             #14            // townId
  #14 = Utf8               townId
  #15 = Methodref          #16.#17        // java/lang/String.equals:(Ljava/lang/Object;)Z
  #16 = Class              #18            // java/lang/String
  #17 = NameAndType        #19:#20        // equals:(Ljava/lang/Object;)Z
  #18 = Utf8               java/lang/String
  #19 = Utf8               equals
  #20 = Utf8               (Ljava/lang/Object;)Z
  #21 = Methodref          #22.#23        // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #22 = Class              #24            // java/lang/Integer
  #23 = NameAndType        #25:#26        // parseInt:(Ljava/lang/String;)I
  #24 = Utf8               java/lang/Integer
  #25 = Utf8               parseInt
  #26 = Utf8               (Ljava/lang/String;)I
  #27 = Fieldref           #8.#28         // ext/mods/gameserver/model/zone/type/TownZone._townId:I
  #28 = NameAndType        #29:#30        // _townId:I
  #29 = Utf8               _townId
  #30 = Utf8               I
  #31 = String             #32            // castleId
  #32 = Utf8               castleId
  #33 = Fieldref           #8.#34         // ext/mods/gameserver/model/zone/type/TownZone._castleId:I
  #34 = NameAndType        #35:#30        // _castleId:I
  #35 = Utf8               _castleId
  #36 = String             #37            // isPeaceZone
  #37 = Utf8               isPeaceZone
  #38 = Methodref          #39.#40        // java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
  #39 = Class              #41            // java/lang/Boolean
  #40 = NameAndType        #42:#43        // parseBoolean:(Ljava/lang/String;)Z
  #41 = Utf8               java/lang/Boolean
  #42 = Utf8               parseBoolean
  #43 = Utf8               (Ljava/lang/String;)Z
  #44 = Methodref          #2.#45         // ext/mods/gameserver/model/zone/type/subtype/ZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
  #45 = NameAndType        #46:#47        // setParameter:(Ljava/lang/String;Ljava/lang/String;)V
  #46 = Utf8               setParameter
  #47 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #48 = Fieldref           #49.#50        // ext/mods/Config.ZONE_TOWN:I
  #49 = Class              #51            // ext/mods/Config
  #50 = NameAndType        #52:#30        // ZONE_TOWN:I
  #51 = Utf8               ext/mods/Config
  #52 = Utf8               ZONE_TOWN
  #53 = Fieldref           #54.#55        // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
  #54 = Class              #56            // ext/mods/gameserver/enums/ZoneId
  #55 = NameAndType        #57:#58        // PEACE:Lext/mods/gameserver/enums/ZoneId;
  #56 = Utf8               ext/mods/gameserver/enums/ZoneId
  #57 = Utf8               PEACE
  #58 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #59 = Methodref          #60.#61        // ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #60 = Class              #62            // ext/mods/gameserver/model/actor/Creature
  #61 = NameAndType        #63:#64        // setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #62 = Utf8               ext/mods/gameserver/model/actor/Creature
  #63 = Utf8               setInsideZone
  #64 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
  #65 = Fieldref           #54.#66        // ext/mods/gameserver/enums/ZoneId.TOWN:Lext/mods/gameserver/enums/ZoneId;
  #66 = NameAndType        #67:#58        // TOWN:Lext/mods/gameserver/enums/ZoneId;
  #67 = Utf8               TOWN
  #68 = Utf8               Code
  #69 = Utf8               LineNumberTable
  #70 = Utf8               LocalVariableTable
  #71 = Utf8               this
  #72 = Utf8               Lext/mods/gameserver/model/zone/type/TownZone;
  #73 = Utf8               id
  #74 = Utf8               name
  #75 = Utf8               Ljava/lang/String;
  #76 = Utf8               value
  #77 = Utf8               StackMapTable
  #78 = Utf8               onEnter
  #79 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #80 = Utf8               creature
  #81 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #82 = Utf8               onExit
  #83 = Utf8               getTownId
  #84 = Utf8               ()I
  #85 = Utf8               getCastleId
  #86 = Utf8               SourceFile
  #87 = Utf8               TownZone.java
{
  public ext.mods.gameserver.model.zone.type.TownZone(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
         5: aload_0
         6: iconst_1
         7: putfield      #7                  // Field _isPeaceZone:Z
        10: return
      LineNumberTable:
        line 38: 0
        line 34: 5
        line 39: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/zone/type/TownZone;
            0      11     1    id   I

  public void setParameter(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: ldc           #13                 // String townId
         3: invokevirtual #15                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          20
         9: aload_0
        10: aload_2
        11: invokestatic  #21                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        14: putfield      #27                 // Field _townId:I
        17: goto          66
        20: aload_1
        21: ldc           #31                 // String castleId
        23: invokevirtual #15                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        26: ifeq          40
        29: aload_0
        30: aload_2
        31: invokestatic  #21                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        34: putfield      #33                 // Field _castleId:I
        37: goto          66
        40: aload_1
        41: ldc           #36                 // String isPeaceZone
        43: invokevirtual #15                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        46: ifeq          60
        49: aload_0
        50: aload_2
        51: invokestatic  #38                 // Method java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
        54: putfield      #7                  // Field _isPeaceZone:Z
        57: goto          66
        60: aload_0
        61: aload_1
        62: aload_2
        63: invokespecial #44                 // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
        66: return
      LineNumberTable:
        line 44: 0
        line 45: 9
        line 46: 20
        line 47: 29
        line 48: 40
        line 49: 49
        line 51: 60
        line 52: 66
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      67     0  this   Lext/mods/gameserver/model/zone/type/TownZone;
            0      67     1  name   Ljava/lang/String;
            0      67     2 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 20 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 5 /* same */

  protected void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _isPeaceZone:Z
         4: ifeq          22
         7: getstatic     #48                 // Field ext/mods/Config.ZONE_TOWN:I
        10: iconst_2
        11: if_icmpeq     22
        14: aload_1
        15: getstatic     #53                 // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
        18: iconst_1
        19: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        22: aload_1
        23: getstatic     #65                 // Field ext/mods/gameserver/enums/ZoneId.TOWN:Lext/mods/gameserver/enums/ZoneId;
        26: iconst_1
        27: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        30: return
      LineNumberTable:
        line 57: 0
        line 58: 14
        line 60: 22
        line 61: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/zone/type/TownZone;
            0      31     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 22 /* same */

  protected void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _isPeaceZone:Z
         4: ifeq          15
         7: aload_1
         8: getstatic     #53                 // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
        11: iconst_0
        12: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        15: aload_1
        16: getstatic     #65                 // Field ext/mods/gameserver/enums/ZoneId.TOWN:Lext/mods/gameserver/enums/ZoneId;
        19: iconst_0
        20: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
        23: return
      LineNumberTable:
        line 66: 0
        line 67: 7
        line 69: 15
        line 70: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/zone/type/TownZone;
            0      24     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 15 /* same */

  public int getTownId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _townId:I
         4: ireturn
      LineNumberTable:
        line 74: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/type/TownZone;

  public final int getCastleId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field _castleId:I
         4: ireturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/type/TownZone;
}
SourceFile: "TownZone.java"
