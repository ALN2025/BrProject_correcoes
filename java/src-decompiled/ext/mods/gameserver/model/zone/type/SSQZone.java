// Bytecode for: ext.mods.gameserver.model.zone.type.SSQZone
// File: ext\mods\gameserver\model\zone\type\SSQZone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/type/SSQZone.class
  Last modified 9 de jul de 2026; size 1681 bytes
  MD5 checksum 3d7cb37d4f758eb5d1e4326a273314e2
  Compiled from "SSQZone.java"
public class ext.mods.gameserver.model.zone.type.SSQZone extends ext.mods.gameserver.model.zone.type.subtype.ZoneType
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/zone/type/SSQZone
  super_class: #2                         // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  interfaces: 0, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
   #2 = Class              #4             // ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #3 = NameAndType        #5:#6          // "<init>":(I)V
   #4 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #5 = Utf8               <init>
   #6 = Utf8               (I)V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/zone/type/SSQZone._oustLoc:[I
   #8 = Class              #10            // ext/mods/gameserver/model/zone/type/SSQZone
   #9 = NameAndType        #11:#12        // _oustLoc:[I
  #10 = Utf8               ext/mods/gameserver/model/zone/type/SSQZone
  #11 = Utf8               _oustLoc
  #12 = Utf8               [I
  #13 = String             #14            // oustX
  #14 = Utf8               oustX
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
  #27 = String             #28            // oustY
  #28 = Utf8               oustY
  #29 = String             #30            // oustZ
  #30 = Utf8               oustZ
  #31 = Methodref          #2.#32         // ext/mods/gameserver/model/zone/type/subtype/ZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
  #32 = NameAndType        #33:#34        // setParameter:(Ljava/lang/String;Ljava/lang/String;)V
  #33 = Utf8               setParameter
  #34 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #35 = Fieldref           #36.#37        // ext/mods/gameserver/enums/ZoneId.SSQ:Lext/mods/gameserver/enums/ZoneId;
  #36 = Class              #38            // ext/mods/gameserver/enums/ZoneId
  #37 = NameAndType        #39:#40        // SSQ:Lext/mods/gameserver/enums/ZoneId;
  #38 = Utf8               ext/mods/gameserver/enums/ZoneId
  #39 = Utf8               SSQ
  #40 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #41 = Methodref          #42.#43        // ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #42 = Class              #44            // ext/mods/gameserver/model/actor/Creature
  #43 = NameAndType        #45:#46        // setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
  #44 = Utf8               ext/mods/gameserver/model/actor/Creature
  #45 = Utf8               setInsideZone
  #46 = Utf8               (Lext/mods/gameserver/enums/ZoneId;Z)V
  #47 = Class              #48            // ext/mods/gameserver/model/actor/instance/Pet
  #48 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
  #49 = Methodref          #47.#50        // ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
  #50 = NameAndType        #51:#52        // getOwner:()Lext/mods/gameserver/model/actor/Player;
  #51 = Utf8               getOwner
  #52 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #53 = Methodref          #47.#54        // ext/mods/gameserver/model/actor/instance/Pet.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #54 = NameAndType        #55:#56        // unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #55 = Utf8               unSummon
  #56 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #57 = Utf8               Code
  #58 = Utf8               LineNumberTable
  #59 = Utf8               LocalVariableTable
  #60 = Utf8               this
  #61 = Utf8               Lext/mods/gameserver/model/zone/type/SSQZone;
  #62 = Utf8               id
  #63 = Utf8               I
  #64 = Utf8               name
  #65 = Utf8               Ljava/lang/String;
  #66 = Utf8               value
  #67 = Utf8               StackMapTable
  #68 = Utf8               onEnter
  #69 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #70 = Utf8               player
  #71 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #72 = Utf8               character
  #73 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #74 = Utf8               onExit
  #75 = Utf8               SourceFile
  #76 = Utf8               SSQZone.java
{
  public ext.mods.gameserver.model.zone.type.SSQZone(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
         5: aload_0
         6: iconst_3
         7: newarray       int
         9: putfield      #7                  // Field _oustLoc:[I
        12: return
      LineNumberTable:
        line 32: 0
        line 28: 5
        line 33: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/zone/type/SSQZone;
            0      13     1    id   I

  public void setParameter(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: ldc           #13                 // String oustX
         3: invokevirtual #15                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          22
         9: aload_0
        10: getfield      #7                  // Field _oustLoc:[I
        13: iconst_0
        14: aload_2
        15: invokestatic  #21                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        18: iastore
        19: goto          72
        22: aload_1
        23: ldc           #27                 // String oustY
        25: invokevirtual #15                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        28: ifeq          44
        31: aload_0
        32: getfield      #7                  // Field _oustLoc:[I
        35: iconst_1
        36: aload_2
        37: invokestatic  #21                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        40: iastore
        41: goto          72
        44: aload_1
        45: ldc           #29                 // String oustZ
        47: invokevirtual #15                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        50: ifeq          66
        53: aload_0
        54: getfield      #7                  // Field _oustLoc:[I
        57: iconst_2
        58: aload_2
        59: invokestatic  #21                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        62: iastore
        63: goto          72
        66: aload_0
        67: aload_1
        68: aload_2
        69: invokespecial #31                 // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType.setParameter:(Ljava/lang/String;Ljava/lang/String;)V
        72: return
      LineNumberTable:
        line 38: 0
        line 39: 9
        line 40: 22
        line 41: 31
        line 42: 44
        line 43: 53
        line 45: 66
        line 46: 72
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      73     0  this   Lext/mods/gameserver/model/zone/type/SSQZone;
            0      73     1  name   Ljava/lang/String;
            0      73     2 value   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 22 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 5 /* same */

  protected void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: getstatic     #35                 // Field ext/mods/gameserver/enums/ZoneId.SSQ:Lext/mods/gameserver/enums/ZoneId;
         4: iconst_1
         5: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
         8: aload_1
         9: instanceof    #47                 // class ext/mods/gameserver/model/actor/instance/Pet
        12: ifeq          35
        15: aload_1
        16: checkcast     #47                 // class ext/mods/gameserver/model/actor/instance/Pet
        19: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
        22: astore_2
        23: aload_2
        24: ifnull        35
        27: aload_1
        28: checkcast     #47                 // class ext/mods/gameserver/model/actor/instance/Pet
        31: aload_2
        32: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/instance/Pet.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
        35: return
      LineNumberTable:
        line 51: 0
        line 53: 8
        line 55: 15
        line 56: 23
        line 58: 27
        line 61: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23      12     2 player   Lext/mods/gameserver/model/actor/Player;
            0      36     0  this   Lext/mods/gameserver/model/zone/type/SSQZone;
            0      36     1 character   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 1
        frame_type = 35 /* same */

  protected void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: getstatic     #35                 // Field ext/mods/gameserver/enums/ZoneId.SSQ:Lext/mods/gameserver/enums/ZoneId;
         4: iconst_0
         5: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Creature.setInsideZone:(Lext/mods/gameserver/enums/ZoneId;Z)V
         8: return
      LineNumberTable:
        line 66: 0
        line 67: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/zone/type/SSQZone;
            0       9     1 character   Lext/mods/gameserver/model/actor/Creature;
}
SourceFile: "SSQZone.java"
