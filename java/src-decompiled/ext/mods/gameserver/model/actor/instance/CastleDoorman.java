// Bytecode for: ext.mods.gameserver.model.actor.instance.CastleDoorman
// File: ext\mods\gameserver\model\actor\instance\CastleDoorman.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/CastleDoorman.class
  Last modified 9 de jul de 2026; size 2884 bytes
  MD5 checksum 712f6a0732ad136269fde2f9ac6830a2
  Compiled from "CastleDoorman.java"
public class ext.mods.gameserver.model.actor.instance.CastleDoorman extends ext.mods.gameserver.model.actor.instance.Doorman
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/CastleDoorman
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Doorman
  interfaces: 0, fields: 0, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Doorman."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Doorman
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Doorman
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/instance/CastleDoorman.getResidence:()Lext/mods/gameserver/model/residence/Residence;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/instance/CastleDoorman
    #9 = NameAndType        #11:#12       // getResidence:()Lext/mods/gameserver/model/residence/Residence;
   #10 = Utf8               ext/mods/gameserver/model/actor/instance/CastleDoorman
   #11 = Utf8               getResidence
   #12 = Utf8               ()Lext/mods/gameserver/model/residence/Residence;
   #13 = Methodref          #14.#15       // java/lang/String.substring:(I)Ljava/lang/String;
   #14 = Class              #16           // java/lang/String
   #15 = NameAndType        #17:#18       // substring:(I)Ljava/lang/String;
   #16 = Utf8               java/lang/String
   #17 = Utf8               substring
   #18 = Utf8               (I)Ljava/lang/String;
   #19 = String             #20           // ,
   #20 = Utf8               ,
   #21 = Methodref          #14.#22       // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #22 = NameAndType        #23:#24       // split:(Ljava/lang/String;)[Ljava/lang/String;
   #23 = Utf8               split
   #24 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #25 = Methodref          #26.#27       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #26 = Class              #28           // java/lang/Integer
   #27 = NameAndType        #29:#30       // parseInt:(Ljava/lang/String;)I
   #28 = Utf8               java/lang/Integer
   #29 = Utf8               parseInt
   #30 = Utf8               (Ljava/lang/String;)I
   #31 = Methodref          #32.#33       // ext/mods/gameserver/model/residence/Residence.openDoor:(Lext/mods/gameserver/model/actor/Player;I)V
   #32 = Class              #34           // ext/mods/gameserver/model/residence/Residence
   #33 = NameAndType        #35:#36       // openDoor:(Lext/mods/gameserver/model/actor/Player;I)V
   #34 = Utf8               ext/mods/gameserver/model/residence/Residence
   #35 = Utf8               openDoor
   #36 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #37 = Methodref          #32.#38       // ext/mods/gameserver/model/residence/Residence.closeDoor:(Lext/mods/gameserver/model/actor/Player;I)V
   #38 = NameAndType        #39:#36       // closeDoor:(Lext/mods/gameserver/model/actor/Player;I)V
   #39 = Utf8               closeDoor
   #40 = Methodref          #41.#42       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #41 = Class              #43           // ext/mods/gameserver/model/actor/Player
   #42 = NameAndType        #44:#45       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #43 = Utf8               ext/mods/gameserver/model/actor/Player
   #44 = Utf8               getClan
   #45 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #46 = Methodref          #8.#47        // ext/mods/gameserver/model/actor/instance/CastleDoorman.getSiegableHall:()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
   #47 = NameAndType        #48:#49       // getSiegableHall:()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
   #48 = Utf8               getSiegableHall
   #49 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
   #50 = Methodref          #41.#51       // ext/mods/gameserver/model/actor/Player.getClanId:()I
   #51 = NameAndType        #52:#53       // getClanId:()I
   #52 = Utf8               getClanId
   #53 = Utf8               ()I
   #54 = Methodref          #55.#56       // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getOwnerId:()I
   #55 = Class              #57           // ext/mods/gameserver/model/residence/clanhall/SiegableHall
   #56 = NameAndType        #58:#53       // getOwnerId:()I
   #57 = Utf8               ext/mods/gameserver/model/residence/clanhall/SiegableHall
   #58 = Utf8               getOwnerId
   #59 = Fieldref           #60.#61       // ext/mods/gameserver/enums/PrivilegeType.CHP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
   #60 = Class              #62           // ext/mods/gameserver/enums/PrivilegeType
   #61 = NameAndType        #63:#64       // CHP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
   #62 = Utf8               ext/mods/gameserver/enums/PrivilegeType
   #63 = Utf8               CHP_ENTRY_EXIT_RIGHTS
   #64 = Utf8               Lext/mods/gameserver/enums/PrivilegeType;
   #65 = Methodref          #41.#66       // ext/mods/gameserver/model/actor/Player.hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
   #66 = NameAndType        #67:#68       // hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
   #67 = Utf8               hasClanPrivileges
   #68 = Utf8               (Lext/mods/gameserver/enums/PrivilegeType;)Z
   #69 = Methodref          #8.#70        // ext/mods/gameserver/model/actor/instance/CastleDoorman.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #70 = NameAndType        #71:#72       // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #71 = Utf8               getCastle
   #72 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
   #73 = Methodref          #74.#56       // ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
   #74 = Class              #75           // ext/mods/gameserver/model/residence/castle/Castle
   #75 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #76 = Fieldref           #60.#77       // ext/mods/gameserver/enums/PrivilegeType.CP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
   #77 = NameAndType        #78:#64       // CP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
   #78 = Utf8               CP_ENTRY_EXIT_RIGHTS
   #79 = Methodref          #55.#80       // ext/mods/gameserver/model/residence/clanhall/SiegableHall.isInSiege:()Z
   #80 = NameAndType        #81:#82       // isInSiege:()Z
   #81 = Utf8               isInSiege
   #82 = Utf8               ()Z
   #83 = Methodref          #74.#84       // ext/mods/gameserver/model/residence/castle/Castle.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
   #84 = NameAndType        #85:#86       // getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
   #85 = Utf8               getSiegeZone
   #86 = Utf8               ()Lext/mods/gameserver/model/zone/type/SiegeZone;
   #87 = Methodref          #88.#89       // ext/mods/gameserver/model/zone/type/SiegeZone.isActive:()Z
   #88 = Class              #90           // ext/mods/gameserver/model/zone/type/SiegeZone
   #89 = NameAndType        #91:#82       // isActive:()Z
   #90 = Utf8               ext/mods/gameserver/model/zone/type/SiegeZone
   #91 = Utf8               isActive
   #92 = Utf8               Code
   #93 = Utf8               LineNumberTable
   #94 = Utf8               LocalVariableTable
   #95 = Utf8               this
   #96 = Utf8               Lext/mods/gameserver/model/actor/instance/CastleDoorman;
   #97 = Utf8               objectId
   #98 = Utf8               I
   #99 = Utf8               template
  #100 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #101 = Utf8               openDoors
  #102 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #103 = Utf8               doorId
  #104 = Utf8               Ljava/lang/String;
  #105 = Utf8               player
  #106 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #107 = Utf8               command
  #108 = Utf8               StackMapTable
  #109 = Class              #110          // "[Ljava/lang/String;"
  #110 = Utf8               [Ljava/lang/String;
  #111 = Utf8               closeDoors
  #112 = Utf8               isOwnerClan
  #113 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #114 = Utf8               isUnderSiege
  #115 = Utf8               hall
  #116 = Utf8               Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
  #117 = Utf8               SourceFile
  #118 = Utf8               CastleDoorman.java
{
  public ext.mods.gameserver.model.actor.instance.CastleDoorman(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Doorman."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 34: 0
        line 35: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/CastleDoorman;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  protected void openDoors(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=7, args_size=3
         0: aload_0
         1: invokevirtual #7                  // Method getResidence:()Lext/mods/gameserver/model/residence/Residence;
         4: ifnonnull     8
         7: return
         8: aload_2
         9: bipush        11
        11: invokevirtual #13                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        14: ldc           #19                 // String ,
        16: invokevirtual #21                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        19: astore_3
        20: aload_3
        21: arraylength
        22: istore        4
        24: iconst_0
        25: istore        5
        27: iload         5
        29: iload         4
        31: if_icmpge     59
        34: aload_3
        35: iload         5
        37: aaload
        38: astore        6
        40: aload_0
        41: invokevirtual #7                  // Method getResidence:()Lext/mods/gameserver/model/residence/Residence;
        44: aload_1
        45: aload         6
        47: invokestatic  #25                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        50: invokevirtual #31                 // Method ext/mods/gameserver/model/residence/Residence.openDoor:(Lext/mods/gameserver/model/actor/Player;I)V
        53: iinc          5, 1
        56: goto          27
        59: return
      LineNumberTable:
        line 40: 0
        line 41: 7
        line 43: 8
        line 44: 40
        line 43: 53
        line 45: 59
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           40      13     6 doorId   Ljava/lang/String;
            0      60     0  this   Lext/mods/gameserver/model/actor/instance/CastleDoorman;
            0      60     1 player   Lext/mods/gameserver/model/actor/Player;
            0      60     2 command   Ljava/lang/String;
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 254 /* append */
          offset_delta = 18
          locals = [ class "[Ljava/lang/String;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 31

  protected final void closeDoors(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=3, locals=7, args_size=3
         0: aload_0
         1: invokevirtual #7                  // Method getResidence:()Lext/mods/gameserver/model/residence/Residence;
         4: ifnonnull     8
         7: return
         8: aload_2
         9: bipush        12
        11: invokevirtual #13                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        14: ldc           #19                 // String ,
        16: invokevirtual #21                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        19: astore_3
        20: aload_3
        21: arraylength
        22: istore        4
        24: iconst_0
        25: istore        5
        27: iload         5
        29: iload         4
        31: if_icmpge     59
        34: aload_3
        35: iload         5
        37: aaload
        38: astore        6
        40: aload_0
        41: invokevirtual #7                  // Method getResidence:()Lext/mods/gameserver/model/residence/Residence;
        44: aload_1
        45: aload         6
        47: invokestatic  #25                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        50: invokevirtual #37                 // Method ext/mods/gameserver/model/residence/Residence.closeDoor:(Lext/mods/gameserver/model/actor/Player;I)V
        53: iinc          5, 1
        56: goto          27
        59: return
      LineNumberTable:
        line 50: 0
        line 51: 7
        line 53: 8
        line 54: 40
        line 53: 53
        line 55: 59
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           40      13     6 doorId   Ljava/lang/String;
            0      60     0  this   Lext/mods/gameserver/model/actor/instance/CastleDoorman;
            0      60     1 player   Lext/mods/gameserver/model/actor/Player;
            0      60     2 command   Ljava/lang/String;
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 254 /* append */
          offset_delta = 18
          locals = [ class "[Ljava/lang/String;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 31

  protected final boolean isOwnerClan(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
         4: ifnull        81
         7: aload_0
         8: invokevirtual #46                 // Method getSiegableHall:()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        11: ifnull        44
        14: aload_1
        15: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        18: aload_0
        19: invokevirtual #46                 // Method getSiegableHall:()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
        22: invokevirtual #54                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getOwnerId:()I
        25: if_icmpne     42
        28: aload_1
        29: getstatic     #59                 // Field ext/mods/gameserver/enums/PrivilegeType.CHP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
        32: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
        35: ifeq          42
        38: iconst_1
        39: goto          43
        42: iconst_0
        43: ireturn
        44: aload_0
        45: invokevirtual #69                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        48: ifnull        81
        51: aload_1
        52: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        55: aload_0
        56: invokevirtual #69                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        59: invokevirtual #73                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        62: if_icmpne     79
        65: aload_1
        66: getstatic     #76                 // Field ext/mods/gameserver/enums/PrivilegeType.CP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
        69: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.hasClanPrivileges:(Lext/mods/gameserver/enums/PrivilegeType;)Z
        72: ifeq          79
        75: iconst_1
        76: goto          80
        79: iconst_0
        80: ireturn
        81: iconst_0
        82: ireturn
      LineNumberTable:
        line 60: 0
        line 62: 7
        line 63: 14
        line 65: 44
        line 66: 51
        line 68: 81
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      83     0  this   Lext/mods/gameserver/model/actor/instance/CastleDoorman;
            0      83     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 6
        frame_type = 42 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 34 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */

  protected final boolean isUnderSiege();
    descriptor: ()Z
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=1, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #46                 // Method getSiegableHall:()Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
         4: astore_1
         5: aload_1
         6: ifnull        14
         9: aload_1
        10: invokevirtual #79                 // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.isInSiege:()Z
        13: ireturn
        14: aload_0
        15: invokevirtual #69                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        18: ifnull        38
        21: aload_0
        22: invokevirtual #69                 // Method getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        25: invokevirtual #83                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
        28: invokevirtual #87                 // Method ext/mods/gameserver/model/zone/type/SiegeZone.isActive:()Z
        31: ifeq          38
        34: iconst_1
        35: goto          39
        38: iconst_0
        39: ireturn
      LineNumberTable:
        line 74: 0
        line 75: 5
        line 76: 9
        line 78: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/model/actor/instance/CastleDoorman;
            5      35     1  hall   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/residence/clanhall/SiegableHall ]
        frame_type = 23 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "CastleDoorman.java"
