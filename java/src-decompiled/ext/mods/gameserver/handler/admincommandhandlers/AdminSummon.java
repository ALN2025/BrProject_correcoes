// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminSummon
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminSummon.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminSummon.class
  Last modified 9 de jul de 2026; size 5240 bytes
  MD5 checksum fc06ec308fb8c2e738b57ebbdd01c26f
  Compiled from "AdminSummon.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminSummon implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #84                         // ext/mods/gameserver/handler/admincommandhandlers/AdminSummon
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // admin_ride
    #8 = Utf8               admin_ride
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Methodref          #16.#17       // ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
   #16 = Class              #18           // ext/mods/gameserver/model/actor/Player
   #17 = NameAndType        #19:#20       // isCursedWeaponEquipped:()Z
   #18 = Utf8               ext/mods/gameserver/model/actor/Player
   #19 = Utf8               isCursedWeaponEquipped
   #20 = Utf8               ()Z
   #21 = String             #22           // You can\'t use this command while cursed weapon is equipped.
   #22 = Utf8               You can\'t use this command while cursed weapon is equipped.
   #23 = Methodref          #16.#24       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #24 = NameAndType        #25:#26       // sendMessage:(Ljava/lang/String;)V
   #25 = Utf8               sendMessage
   #26 = Utf8               (Ljava/lang/String;)V
   #27 = Class              #28           // java/util/StringTokenizer
   #28 = Utf8               java/util/StringTokenizer
   #29 = String             #30           //
   #30 = Utf8
   #31 = Methodref          #27.#32       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #32 = NameAndType        #5:#33        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #33 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #34 = Methodref          #27.#35       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #35 = NameAndType        #36:#37       // nextToken:()Ljava/lang/String;
   #36 = Utf8               nextToken
   #37 = Utf8               ()Ljava/lang/String;
   #38 = Methodref          #27.#39       // java/util/StringTokenizer.hasMoreTokens:()Z
   #39 = NameAndType        #40:#20       // hasMoreTokens:()Z
   #40 = Utf8               hasMoreTokens
   #41 = String             #42           // You must enter a parameter for that command.
   #42 = Utf8               You must enter a parameter for that command.
   #43 = String             #44           // wyvern
   #44 = Utf8               wyvern
   #45 = Methodref          #10.#46       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #46 = NameAndType        #47:#48       // equals:(Ljava/lang/Object;)Z
   #47 = Utf8               equals
   #48 = Utf8               (Ljava/lang/Object;)Z
   #49 = String             #50           // 2
   #50 = Utf8               2
   #51 = String             #52           // strider
   #52 = Utf8               strider
   #53 = String             #54           // 1
   #54 = Utf8               1
   #55 = InvokeDynamic      #0:#56        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #56 = NameAndType        #57:#58       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #57 = Utf8               makeConcatWithConstants
   #58 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #59 = Methodref          #16.#60       // ext/mods/gameserver/model/actor/Player.isMounted:()Z
   #60 = NameAndType        #61:#20       // isMounted:()Z
   #61 = Utf8               isMounted
   #62 = Methodref          #16.#63       // ext/mods/gameserver/model/actor/Player.dismount:()V
   #63 = NameAndType        #64:#6        // dismount:()V
   #64 = Utf8               dismount
   #65 = Methodref          #16.#66       // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #66 = NameAndType        #67:#68       // getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #67 = Utf8               getSummon
   #68 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
   #69 = Methodref          #70.#71       // ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
   #70 = Class              #72           // ext/mods/gameserver/model/actor/Summon
   #71 = NameAndType        #73:#74       // unSummon:(Lext/mods/gameserver/model/actor/Player;)V
   #72 = Utf8               ext/mods/gameserver/model/actor/Summon
   #73 = Utf8               unSummon
   #74 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #75 = Methodref          #16.#76       // ext/mods/gameserver/model/actor/Player.mount:(II)Z
   #76 = NameAndType        #77:#78       // mount:(II)Z
   #77 = Utf8               mount
   #78 = Utf8               (II)Z
   #79 = String             #80           // admin_unride
   #80 = Utf8               admin_unride
   #81 = Class              #82           // ext/mods/gameserver/model/actor/Playable
   #82 = Utf8               ext/mods/gameserver/model/actor/Playable
   #83 = Methodref          #84.#85       // ext/mods/gameserver/handler/admincommandhandlers/AdminSummon.getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
   #84 = Class              #86           // ext/mods/gameserver/handler/admincommandhandlers/AdminSummon
   #85 = NameAndType        #87:#88       // getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
   #86 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminSummon
   #87 = Utf8               getTarget
   #88 = Utf8               (Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
   #89 = Methodref          #81.#90       // ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #90 = NameAndType        #91:#92       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #91 = Utf8               getActingPlayer
   #92 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #93 = Fieldref           #94.#95       // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #94 = Class              #96           // ext/mods/gameserver/network/SystemMessageId
   #95 = NameAndType        #97:#98       // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #96 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #97 = Utf8               INVALID_TARGET
   #98 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #99 = Methodref          #16.#100      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #100 = NameAndType        #101:#102     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #101 = Utf8               sendPacket
  #102 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #103 = String             #104          // admin_unsummon
  #104 = Utf8               admin_unsummon
  #105 = String             #106          // admin_summon
  #106 = Utf8               admin_summon
  #107 = Class              #108          // ext/mods/gameserver/model/actor/instance/Pet
  #108 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
  #109 = Methodref          #27.#110      // java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
  #110 = NameAndType        #5:#26        // "<init>":(Ljava/lang/String;)V
  #111 = Methodref          #10.#112      // java/lang/String.hashCode:()I
  #112 = NameAndType        #113:#114     // hashCode:()I
  #113 = Utf8               hashCode
  #114 = Utf8               ()I
  #115 = String             #116          // food
  #116 = Utf8               food
  #117 = String             #118          // inventory
  #118 = Utf8               inventory
  #119 = String             #120          // level
  #120 = Utf8               level
  #121 = Methodref          #107.#122     // ext/mods/gameserver/model/actor/instance/Pet.getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
  #122 = NameAndType        #123:#124     // getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
  #123 = Utf8               getPetData
  #124 = Utf8               ()Lext/mods/gameserver/model/records/PetDataEntry;
  #125 = Methodref          #126.#127     // ext/mods/gameserver/model/records/PetDataEntry.maxMeal:()I
  #126 = Class              #128          // ext/mods/gameserver/model/records/PetDataEntry
  #127 = NameAndType        #129:#114     // maxMeal:()I
  #128 = Utf8               ext/mods/gameserver/model/records/PetDataEntry
  #129 = Utf8               maxMeal
  #130 = Methodref          #107.#131     // ext/mods/gameserver/model/actor/instance/Pet.setCurrentFed:(I)V
  #131 = NameAndType        #132:#133     // setCurrentFed:(I)V
  #132 = Utf8               setCurrentFed
  #133 = Utf8               (I)V
  #134 = Class              #135          // ext/mods/gameserver/network/serverpackets/GMViewItemList
  #135 = Utf8               ext/mods/gameserver/network/serverpackets/GMViewItemList
  #136 = Methodref          #134.#137     // ext/mods/gameserver/network/serverpackets/GMViewItemList."<init>":(Lext/mods/gameserver/model/actor/instance/Pet;)V
  #137 = NameAndType        #5:#138       // "<init>":(Lext/mods/gameserver/model/actor/instance/Pet;)V
  #138 = Utf8               (Lext/mods/gameserver/model/actor/instance/Pet;)V
  #139 = Methodref          #16.#140      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #140 = NameAndType        #101:#141     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #141 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #142 = Methodref          #143.#144     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #143 = Class              #145          // java/lang/Integer
  #144 = NameAndType        #146:#147     // parseInt:(Ljava/lang/String;)I
  #145 = Utf8               java/lang/Integer
  #146 = Utf8               parseInt
  #147 = Utf8               (Ljava/lang/String;)I
  #148 = Methodref          #107.#149     // ext/mods/gameserver/model/actor/instance/Pet.getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
  #149 = NameAndType        #150:#151     // getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
  #150 = Utf8               getTemplate
  #151 = Utf8               ()Lext/mods/gameserver/model/actor/template/PetTemplate;
  #152 = Methodref          #153.#154     // ext/mods/gameserver/model/actor/template/PetTemplate.getPetDataEntry:(I)Lext/mods/gameserver/model/records/PetDataEntry;
  #153 = Class              #155          // ext/mods/gameserver/model/actor/template/PetTemplate
  #154 = NameAndType        #156:#157     // getPetDataEntry:(I)Lext/mods/gameserver/model/records/PetDataEntry;
  #155 = Utf8               ext/mods/gameserver/model/actor/template/PetTemplate
  #156 = Utf8               getPetDataEntry
  #157 = Utf8               (I)Lext/mods/gameserver/model/records/PetDataEntry;
  #158 = String             #159          // Invalid level for //summon level.
  #159 = Utf8               Invalid level for //summon level.
  #160 = Methodref          #107.#161     // ext/mods/gameserver/model/actor/instance/Pet.getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
  #161 = NameAndType        #162:#163     // getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
  #162 = Utf8               getStatus
  #163 = Utf8               ()Lext/mods/gameserver/model/actor/status/PetStatus;
  #164 = Methodref          #165.#166     // ext/mods/gameserver/model/actor/status/PetStatus.getExp:()J
  #165 = Class              #167          // ext/mods/gameserver/model/actor/status/PetStatus
  #166 = NameAndType        #168:#169     // getExp:()J
  #167 = Utf8               ext/mods/gameserver/model/actor/status/PetStatus
  #168 = Utf8               getExp
  #169 = Utf8               ()J
  #170 = Methodref          #126.#171     // ext/mods/gameserver/model/records/PetDataEntry.maxExp:()J
  #171 = NameAndType        #172:#169     // maxExp:()J
  #172 = Utf8               maxExp
  #173 = Methodref          #165.#174     // ext/mods/gameserver/model/actor/status/PetStatus.removeExp:(J)Z
  #174 = NameAndType        #175:#176     // removeExp:(J)Z
  #175 = Utf8               removeExp
  #176 = Utf8               (J)Z
  #177 = Methodref          #165.#178     // ext/mods/gameserver/model/actor/status/PetStatus.addExp:(J)Z
  #178 = NameAndType        #179:#176     // addExp:(J)Z
  #179 = Utf8               addExp
  #180 = String             #181          // Usage: //summon food|inventory|level>
  #181 = Utf8               Usage: //summon food|inventory|level>
  #182 = Class              #183          // java/lang/Exception
  #183 = Utf8               java/lang/Exception
  #184 = Fieldref           #84.#185      // ext/mods/gameserver/handler/admincommandhandlers/AdminSummon.ADMIN_COMMANDS:[Ljava/lang/String;
  #185 = NameAndType        #186:#187     // ADMIN_COMMANDS:[Ljava/lang/String;
  #186 = Utf8               ADMIN_COMMANDS
  #187 = Utf8               [Ljava/lang/String;
  #188 = Class              #189          // ext/mods/gameserver/handler/IAdminCommandHandler
  #189 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #190 = Utf8               Code
  #191 = Utf8               LineNumberTable
  #192 = Utf8               LocalVariableTable
  #193 = Utf8               this
  #194 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminSummon;
  #195 = Utf8               useAdminCommand
  #196 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #197 = Utf8               npcId
  #198 = Utf8               I
  #199 = Utf8               st
  #200 = Utf8               Ljava/util/StringTokenizer;
  #201 = Utf8               Ljava/lang/String;
  #202 = Utf8               pet
  #203 = Utf8               Lext/mods/gameserver/model/actor/instance/Pet;
  #204 = Utf8               pde
  #205 = Utf8               Lext/mods/gameserver/model/records/PetDataEntry;
  #206 = Utf8               oldExp
  #207 = Utf8               J
  #208 = Utf8               newExp
  #209 = Utf8               e
  #210 = Utf8               Ljava/lang/Exception;
  #211 = Utf8               targetPlayer
  #212 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #213 = Utf8               summon
  #214 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #215 = Utf8               command
  #216 = Utf8               player
  #217 = Utf8               StackMapTable
  #218 = Utf8               getAdminCommandList
  #219 = Utf8               ()[Ljava/lang/String;
  #220 = Utf8               <clinit>
  #221 = Utf8               SourceFile
  #222 = Utf8               AdminSummon.java
  #223 = Utf8               BootstrapMethods
  #224 = String             #225          // Parameter \'\u0001\' isn\'t recognized for that command.
  #225 = Utf8               Parameter \'\u0001\' isn\'t recognized for that command.
  #226 = MethodHandle       6:#227        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #227 = Methodref          #228.#229     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #228 = Class              #230          // java/lang/invoke/StringConcatFactory
  #229 = NameAndType        #57:#231      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #230 = Utf8               java/lang/invoke/StringConcatFactory
  #231 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #232 = Utf8               InnerClasses
  #233 = Class              #234          // java/lang/invoke/MethodHandles$Lookup
  #234 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #235 = Class              #236          // java/lang/invoke/MethodHandles
  #236 = Utf8               java/lang/invoke/MethodHandles
  #237 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminSummon();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 31: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminSummon;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=15, args_size=3
         0: aload_1
         1: ldc           #7                  // String admin_ride
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          167
         9: aload_2
        10: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
        13: ifeq          23
        16: aload_2
        17: ldc           #21                 // String You can\'t use this command while cursed weapon is equipped.
        19: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        22: return
        23: new           #27                 // class java/util/StringTokenizer
        26: dup
        27: aload_1
        28: ldc           #29                 // String
        30: invokespecial #31                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        33: astore_3
        34: aload_3
        35: invokevirtual #34                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        38: pop
        39: aload_3
        40: invokevirtual #38                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        43: ifne          53
        46: aload_2
        47: ldc           #41                 // String You must enter a parameter for that command.
        49: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        52: return
        53: aload_3
        54: invokevirtual #34                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        57: astore        4
        59: aload         4
        61: ldc           #43                 // String wyvern
        63: invokevirtual #45                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        66: ifne          79
        69: aload         4
        71: ldc           #49                 // String 2
        73: invokevirtual #45                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        76: ifeq          87
        79: sipush        12621
        82: istore        5
        84: goto          127
        87: aload         4
        89: ldc           #51                 // String strider
        91: invokevirtual #45                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        94: ifne          107
        97: aload         4
        99: ldc           #53                 // String 1
       101: invokevirtual #45                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       104: ifeq          115
       107: sipush        12526
       110: istore        5
       112: goto          127
       115: aload_2
       116: aload         4
       118: invokedynamic #55,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       123: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       126: return
       127: aload_2
       128: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
       131: ifeq          141
       134: aload_2
       135: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.dismount:()V
       138: goto          156
       141: aload_2
       142: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       145: ifnull        156
       148: aload_2
       149: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       152: aload_2
       153: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
       156: aload_2
       157: iload         5
       159: iconst_0
       160: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.mount:(II)Z
       163: pop
       164: goto          570
       167: aload_1
       168: ldc           #79                 // String admin_unride
       170: invokevirtual #45                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       173: ifeq          183
       176: aload_2
       177: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.dismount:()V
       180: goto          570
       183: aload_0
       184: ldc           #81                 // class ext/mods/gameserver/model/actor/Playable
       186: aload_2
       187: iconst_1
       188: invokevirtual #83                 // Method getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
       191: checkcast     #81                 // class ext/mods/gameserver/model/actor/Playable
       194: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       197: astore_3
       198: aload_3
       199: ifnonnull     210
       202: aload_2
       203: getstatic     #93                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       206: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       209: return
       210: aload_3
       211: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       214: astore        4
       216: aload_1
       217: ldc           #103                // String admin_unsummon
       219: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       222: ifeq          247
       225: aload         4
       227: ifnonnull     238
       230: aload_2
       231: getstatic     #93                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       234: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       237: return
       238: aload         4
       240: aload_3
       241: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
       244: goto          570
       247: aload_1
       248: ldc           #105                // String admin_summon
       250: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       253: ifeq          570
       256: aload         4
       258: instanceof    #107                // class ext/mods/gameserver/model/actor/instance/Pet
       261: ifeq          274
       264: aload         4
       266: checkcast     #107                // class ext/mods/gameserver/model/actor/instance/Pet
       269: astore        5
       271: goto          282
       274: aload_2
       275: getstatic     #93                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       278: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       281: return
       282: new           #27                 // class java/util/StringTokenizer
       285: dup
       286: aload_1
       287: invokespecial #109                // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
       290: astore        6
       292: aload         6
       294: invokevirtual #34                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       297: pop
       298: aload         6
       300: invokevirtual #34                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       303: astore        7
       305: iconst_m1
       306: istore        8
       308: aload         7
       310: invokevirtual #111                // Method java/lang/String.hashCode:()I
       313: lookupswitch  { // 3

             -2020599460: 364

                 3148894: 348

               102865796: 380
                 default: 393
            }
       348: aload         7
       350: ldc           #115                // String food
       352: invokevirtual #45                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       355: ifeq          393
       358: iconst_0
       359: istore        8
       361: goto          393
       364: aload         7
       366: ldc           #117                // String inventory
       368: invokevirtual #45                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       371: ifeq          393
       374: iconst_1
       375: istore        8
       377: goto          393
       380: aload         7
       382: ldc           #119                // String level
       384: invokevirtual #45                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       387: ifeq          393
       390: iconst_2
       391: istore        8
       393: iload         8
       395: tableswitch   { // 0 to 2

                       0: 420

                       1: 436

                       2: 452
                 default: 553
            }
       420: aload         5
       422: aload         5
       424: invokevirtual #121                // Method ext/mods/gameserver/model/actor/instance/Pet.getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
       427: invokevirtual #125                // Method ext/mods/gameserver/model/records/PetDataEntry.maxMeal:()I
       430: invokevirtual #130                // Method ext/mods/gameserver/model/actor/instance/Pet.setCurrentFed:(I)V
       433: goto          559
       436: aload_2
       437: new           #134                // class ext/mods/gameserver/network/serverpackets/GMViewItemList
       440: dup
       441: aload         5
       443: invokespecial #136                // Method ext/mods/gameserver/network/serverpackets/GMViewItemList."<init>":(Lext/mods/gameserver/model/actor/instance/Pet;)V
       446: invokevirtual #139                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       449: goto          559
       452: aload         6
       454: invokevirtual #34                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       457: invokestatic  #142                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       460: istore        9
       462: aload         5
       464: invokevirtual #148                // Method ext/mods/gameserver/model/actor/instance/Pet.getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
       467: iload         9
       469: invokevirtual #152                // Method ext/mods/gameserver/model/actor/template/PetTemplate.getPetDataEntry:(I)Lext/mods/gameserver/model/records/PetDataEntry;
       472: astore        10
       474: aload         10
       476: ifnonnull     486
       479: aload_2
       480: ldc           #158                // String Invalid level for //summon level.
       482: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       485: return
       486: aload         5
       488: invokevirtual #160                // Method ext/mods/gameserver/model/actor/instance/Pet.getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
       491: invokevirtual #164                // Method ext/mods/gameserver/model/actor/status/PetStatus.getExp:()J
       494: lstore        11
       496: aload         10
       498: invokevirtual #170                // Method ext/mods/gameserver/model/records/PetDataEntry.maxExp:()J
       501: lstore        13
       503: lload         11
       505: lload         13
       507: lcmp
       508: ifle          528
       511: aload         5
       513: invokevirtual #160                // Method ext/mods/gameserver/model/actor/instance/Pet.getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
       516: lload         11
       518: lload         13
       520: lsub
       521: invokevirtual #173                // Method ext/mods/gameserver/model/actor/status/PetStatus.removeExp:(J)Z
       524: pop
       525: goto          559
       528: lload         11
       530: lload         13
       532: lcmp
       533: ifge          559
       536: aload         5
       538: invokevirtual #160                // Method ext/mods/gameserver/model/actor/instance/Pet.getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
       541: lload         13
       543: lload         11
       545: lsub
       546: invokevirtual #177                // Method ext/mods/gameserver/model/actor/status/PetStatus.addExp:(J)Z
       549: pop
       550: goto          559
       553: aload_2
       554: ldc           #180                // String Usage: //summon food|inventory|level>
       556: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       559: goto          570
       562: astore        7
       564: aload_2
       565: ldc           #180                // String Usage: //summon food|inventory|level>
       567: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       570: return
      Exception table:
         from    to  target type
           298   485   562   Class java/lang/Exception
           486   559   562   Class java/lang/Exception
      LineNumberTable:
        line 44: 0
        line 46: 9
        line 48: 16
        line 49: 22
        line 52: 23
        line 53: 34
        line 55: 39
        line 57: 46
        line 58: 52
        line 61: 53
        line 64: 59
        line 65: 79
        line 66: 87
        line 67: 107
        line 70: 115
        line 71: 126
        line 74: 127
        line 75: 134
        line 76: 141
        line 77: 148
        line 79: 156
        line 80: 164
        line 81: 167
        line 83: 176
        line 87: 183
        line 88: 198
        line 90: 202
        line 91: 209
        line 94: 210
        line 96: 216
        line 98: 225
        line 100: 230
        line 101: 237
        line 104: 238
        line 106: 247
        line 108: 256
        line 110: 274
        line 111: 281
        line 114: 282
        line 115: 292
        line 119: 298
        line 122: 420
        line 123: 433
        line 126: 436
        line 127: 449
        line 130: 452
        line 132: 462
        line 133: 474
        line 135: 479
        line 136: 485
        line 139: 486
        line 140: 496
        line 142: 503
        line 143: 511
        line 144: 528
        line 145: 536
        line 149: 553
        line 156: 559
        line 153: 562
        line 155: 564
        line 159: 570
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           84       3     5 npcId   I
          112       3     5 npcId   I
           34     130     3    st   Ljava/util/StringTokenizer;
           59     105     4 mount   Ljava/lang/String;
          127      37     5 npcId   I
          271       3     5   pet   Lext/mods/gameserver/model/actor/instance/Pet;
          462      91     9 level   I
          474      79    10   pde   Lext/mods/gameserver/model/records/PetDataEntry;
          496      57    11 oldExp   J
          503      50    13 newExp   J
          564       6     7     e   Ljava/lang/Exception;
          282     288     5   pet   Lext/mods/gameserver/model/actor/instance/Pet;
          292     278     6    st   Ljava/util/StringTokenizer;
          198     372     3 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          216     354     4 summon   Lext/mods/gameserver/model/actor/Summon;
            0     571     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminSummon;
            0     571     1 command   Ljava/lang/String;
            0     571     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 29
        frame_type = 23 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class java/util/StringTokenizer ]
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class java/lang/String ]
        frame_type = 7 /* same */
        frame_type = 19 /* same */
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ int ]
        frame_type = 13 /* same */
        frame_type = 14 /* same */
        frame_type = 248 /* chop */
          offset_delta = 10
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/actor/Summon ]
        frame_type = 8 /* same */
        frame_type = 26 /* same */
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/model/actor/instance/Pet ]
        frame_type = 254 /* append */
          offset_delta = 65
          locals = [ class java/util/StringTokenizer, class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 253 /* append */
          offset_delta = 33
          locals = [ int, class ext/mods/gameserver/model/records/PetDataEntry ]
        frame_type = 253 /* append */
          offset_delta = 41
          locals = [ long, long ]
        frame_type = 255 /* full_frame */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSummon, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/model/actor/instance/Pet, class java/util/StringTokenizer, class java/lang/String, int ]
          stack = []
        frame_type = 249 /* chop */
          offset_delta = 5
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminSummon, class java/lang/String, class ext/mods/gameserver/model/actor/Player ]
          stack = []

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #184                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 164: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminSummon;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_4
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String admin_ride
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #79                 // String admin_unride
        13: aastore
        14: dup
        15: iconst_2
        16: ldc           #103                // String admin_unsummon
        18: aastore
        19: dup
        20: iconst_3
        21: ldc           #105                // String admin_summon
        23: aastore
        24: putstatic     #184                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        27: return
      LineNumberTable:
        line 33: 0
}
SourceFile: "AdminSummon.java"
BootstrapMethods:
  0: #226 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #224 Parameter \'\u0001\' isn\'t recognized for that command.
InnerClasses:
  public static final #237= #233 of #235; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
