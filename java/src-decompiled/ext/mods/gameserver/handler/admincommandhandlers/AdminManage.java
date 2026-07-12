// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminManage
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminManage.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminManage.class
  Last modified 9 de jul de 2026; size 5926 bytes
  MD5 checksum 8cfc6993678df1ff8649328a186655bf
  Compiled from "AdminManage.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminManage implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #35                         // ext/mods/gameserver/handler/admincommandhandlers/AdminManage
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 11, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/StringTokenizer
    #8 = Utf8               java/util/StringTokenizer
    #9 = String             #10           //
   #10 = Utf8
   #11 = Methodref          #7.#12        // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #13 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #14 = Methodref          #7.#15        // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #15 = NameAndType        #16:#17       // nextToken:()Ljava/lang/String;
   #16 = Utf8               nextToken
   #17 = Utf8               ()Ljava/lang/String;
   #18 = Methodref          #7.#19        // java/util/StringTokenizer.countTokens:()I
   #19 = NameAndType        #20:#21       // countTokens:()I
   #20 = Utf8               countTokens
   #21 = Utf8               ()I
   #22 = Methodref          #23.#24       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #23 = Class              #25           // java/lang/Integer
   #24 = NameAndType        #26:#27       // parseInt:(Ljava/lang/String;)I
   #25 = Utf8               java/lang/Integer
   #26 = Utf8               parseInt
   #27 = Utf8               (Ljava/lang/String;)I
   #28 = Methodref          #29.#30       // ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
   #29 = Class              #31           // ext/mods/commons/lang/StringUtil
   #30 = NameAndType        #32:#33       // isDigit:(Ljava/lang/String;)Z
   #31 = Utf8               ext/mods/commons/lang/StringUtil
   #32 = Utf8               isDigit
   #33 = Utf8               (Ljava/lang/String;)Z
   #34 = Methodref          #35.#36       // ext/mods/gameserver/handler/admincommandhandlers/AdminManage.getTargetCreature:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
   #35 = Class              #37           // ext/mods/gameserver/handler/admincommandhandlers/AdminManage
   #36 = NameAndType        #38:#39       // getTargetCreature:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
   #37 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminManage
   #38 = Utf8               getTargetCreature
   #39 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
   #40 = Class              #41           // java/lang/String
   #41 = Utf8               java/lang/String
   #42 = Methodref          #29.#43       // ext/mods/commons/lang/StringUtil.isEmpty:([Ljava/lang/String;)Z
   #43 = NameAndType        #44:#45       // isEmpty:([Ljava/lang/String;)Z
   #44 = Utf8               isEmpty
   #45 = Utf8               ([Ljava/lang/String;)Z
   #46 = Methodref          #47.#48       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #47 = Class              #49           // ext/mods/gameserver/model/World
   #48 = NameAndType        #50:#51       // getInstance:()Lext/mods/gameserver/model/World;
   #49 = Utf8               ext/mods/gameserver/model/World
   #50 = Utf8               getInstance
   #51 = Utf8               ()Lext/mods/gameserver/model/World;
   #52 = Methodref          #47.#53       // ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
   #53 = NameAndType        #54:#55       // getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
   #54 = Utf8               getPlayer
   #55 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
   #56 = Fieldref           #57.#58       // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #57 = Class              #59           // ext/mods/gameserver/network/SystemMessageId
   #58 = NameAndType        #60:#61       // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #59 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #60 = Utf8               INVALID_TARGET
   #61 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #62 = Methodref          #63.#64       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #63 = Class              #65           // ext/mods/gameserver/model/actor/Player
   #64 = NameAndType        #66:#67       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #65 = Utf8               ext/mods/gameserver/model/actor/Player
   #66 = Utf8               sendPacket
   #67 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #68 = String             #69           // admin_cancel
   #69 = Utf8               admin_cancel
   #70 = Methodref          #40.#71       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #71 = NameAndType        #72:#33       // startsWith:(Ljava/lang/String;)Z
   #72 = Utf8               startsWith
   #73 = Methodref          #74.#75       // ext/mods/gameserver/model/actor/Creature.stopAllEffects:()V
   #74 = Class              #76           // ext/mods/gameserver/model/actor/Creature
   #75 = NameAndType        #77:#6        // stopAllEffects:()V
   #76 = Utf8               ext/mods/gameserver/model/actor/Creature
   #77 = Utf8               stopAllEffects
   #78 = InvokeDynamic      #0:#79        // #0:accept:()Ljava/util/function/Consumer;
   #79 = NameAndType        #80:#81       // accept:()Ljava/util/function/Consumer;
   #80 = Utf8               accept
   #81 = Utf8               ()Ljava/util/function/Consumer;
   #82 = Methodref          #74.#83       // ext/mods/gameserver/model/actor/Creature.forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
   #83 = NameAndType        #84:#85       // forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
   #84 = Utf8               forEachKnownTypeInRadius
   #85 = Utf8               (Ljava/lang/Class;ILjava/util/function/Consumer;)V
   #86 = String             #87           // admin_heal
   #87 = Utf8               admin_heal
   #88 = Methodref          #35.#89       // ext/mods/gameserver/handler/admincommandhandlers/AdminManage.heal:(Lext/mods/gameserver/model/actor/Creature;)V
   #89 = NameAndType        #90:#91       // heal:(Lext/mods/gameserver/model/actor/Creature;)V
   #90 = Utf8               heal
   #91 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
   #92 = InvokeDynamic      #1:#79        // #1:accept:()Ljava/util/function/Consumer;
   #93 = String             #94           // admin_kill
   #94 = Utf8               admin_kill
   #95 = Methodref          #35.#96       // ext/mods/gameserver/handler/admincommandhandlers/AdminManage.kill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)Z
   #96 = NameAndType        #97:#98       // kill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)Z
   #97 = Utf8               kill
   #98 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)Z
   #99 = InvokeDynamic      #2:#100       // #2:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #100 = NameAndType        #80:#101      // accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #101 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #102 = String             #103          // admin_suicide
  #103 = Utf8               admin_suicide
  #104 = Methodref          #35.#105      // ext/mods/gameserver/handler/admincommandhandlers/AdminManage.suicide:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)Z
  #105 = NameAndType        #106:#98      // suicide:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)Z
  #106 = Utf8               suicide
  #107 = Methodref          #74.#108      // ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
  #108 = NameAndType        #109:#17      // getName:()Ljava/lang/String;
  #109 = Utf8               getName
  #110 = InvokeDynamic      #3:#111       // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #111 = NameAndType        #112:#113     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #112 = Utf8               makeConcatWithConstants
  #113 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #114 = Methodref          #63.#115      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #115 = NameAndType        #116:#117     // sendMessage:(Ljava/lang/String;)V
  #116 = Utf8               sendMessage
  #117 = Utf8               (Ljava/lang/String;)V
  #118 = String             #119          // admin_res
  #119 = Utf8               admin_res
  #120 = Methodref          #35.#121      // ext/mods/gameserver/handler/admincommandhandlers/AdminManage.resurrect:(Lext/mods/gameserver/model/actor/Creature;)V
  #121 = NameAndType        #122:#91      // resurrect:(Lext/mods/gameserver/model/actor/Creature;)V
  #122 = Utf8               resurrect
  #123 = InvokeDynamic      #4:#79        // #4:accept:()Ljava/util/function/Consumer;
  #124 = Fieldref           #35.#125      // ext/mods/gameserver/handler/admincommandhandlers/AdminManage.ADMIN_COMMANDS:[Ljava/lang/String;
  #125 = NameAndType        #126:#127     // ADMIN_COMMANDS:[Ljava/lang/String;
  #126 = Utf8               ADMIN_COMMANDS
  #127 = Utf8               [Ljava/lang/String;
  #128 = Methodref          #74.#129      // ext/mods/gameserver/model/actor/Creature.isDead:()Z
  #129 = NameAndType        #130:#131     // isDead:()Z
  #130 = Utf8               isDead
  #131 = Utf8               ()Z
  #132 = Methodref          #63.#133      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #133 = NameAndType        #134:#135     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #134 = Utf8               getStatus
  #135 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #136 = Methodref          #137.#138     // ext/mods/gameserver/model/actor/status/PlayerStatus.setMaxCpHpMp:()V
  #137 = Class              #139          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #138 = NameAndType        #140:#6       // setMaxCpHpMp:()V
  #139 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #140 = Utf8               setMaxCpHpMp
  #141 = Methodref          #74.#142      // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #142 = NameAndType        #134:#143     // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #143 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #144 = Methodref          #145.#146     // ext/mods/gameserver/model/actor/status/CreatureStatus.setMaxHpMp:()V
  #145 = Class              #147          // ext/mods/gameserver/model/actor/status/CreatureStatus
  #146 = NameAndType        #148:#6       // setMaxHpMp:()V
  #147 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
  #148 = Utf8               setMaxHpMp
  #149 = Methodref          #145.#150     // ext/mods/gameserver/model/actor/status/CreatureStatus.getMaxHp:()I
  #150 = NameAndType        #151:#21      // getMaxHp:()I
  #151 = Utf8               getMaxHp
  #152 = Methodref          #145.#153     // ext/mods/gameserver/model/actor/status/CreatureStatus.getMaxCp:()I
  #153 = NameAndType        #154:#21      // getMaxCp:()I
  #154 = Utf8               getMaxCp
  #155 = Methodref          #74.#156      // ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #156 = NameAndType        #157:#158     // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #157 = Utf8               reduceCurrentHp
  #158 = Utf8               (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #159 = Methodref          #74.#160      // ext/mods/gameserver/model/actor/Creature.isChampion:()Z
  #160 = NameAndType        #161:#131     // isChampion:()Z
  #161 = Utf8               isChampion
  #162 = Fieldref           #163.#164     // ext/mods/Config.CHAMPION_HP:I
  #163 = Class              #165          // ext/mods/Config
  #164 = NameAndType        #166:#167     // CHAMPION_HP:I
  #165 = Utf8               ext/mods/Config
  #166 = Utf8               CHAMPION_HP
  #167 = Utf8               I
  #168 = Double             100.0d
  #170 = Methodref          #63.#171      // ext/mods/gameserver/model/actor/Player.restoreExp:(D)V
  #171 = NameAndType        #172:#173     // restoreExp:(D)V
  #172 = Utf8               restoreExp
  #173 = Utf8               (D)V
  #174 = Methodref          #175.#176     // ext/mods/gameserver/taskmanager/DecayTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
  #175 = Class              #177          // ext/mods/gameserver/taskmanager/DecayTaskManager
  #176 = NameAndType        #50:#178      // getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
  #177 = Utf8               ext/mods/gameserver/taskmanager/DecayTaskManager
  #178 = Utf8               ()Lext/mods/gameserver/taskmanager/DecayTaskManager;
  #179 = Methodref          #175.#180     // ext/mods/gameserver/taskmanager/DecayTaskManager.cancel:(Lext/mods/gameserver/model/actor/Creature;)Z
  #180 = NameAndType        #181:#182     // cancel:(Lext/mods/gameserver/model/actor/Creature;)Z
  #181 = Utf8               cancel
  #182 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #183 = Methodref          #74.#184      // ext/mods/gameserver/model/actor/Creature.doRevive:()V
  #184 = NameAndType        #185:#6       // doRevive:()V
  #185 = Utf8               doRevive
  #186 = Class              #187          // ext/mods/gameserver/handler/IAdminCommandHandler
  #187 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #188 = Utf8               Code
  #189 = Utf8               LineNumberTable
  #190 = Utf8               LocalVariableTable
  #191 = Utf8               this
  #192 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminManage;
  #193 = Utf8               useAdminCommand
  #194 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #195 = Utf8               paramToTest
  #196 = Utf8               Ljava/lang/String;
  #197 = Utf8               worldPlayer
  #198 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #199 = Utf8               command
  #200 = Utf8               player
  #201 = Utf8               st
  #202 = Utf8               Ljava/util/StringTokenizer;
  #203 = Utf8               name
  #204 = Utf8               radius
  #205 = Utf8               paramCount
  #206 = Utf8               targetCreature
  #207 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #208 = Utf8               StackMapTable
  #209 = Utf8               getAdminCommandList
  #210 = Utf8               ()[Ljava/lang/String;
  #211 = Utf8               creature
  #212 = Utf8               lambda$useAdminCommand$2
  #213 = Utf8               c
  #214 = Utf8               lambda$useAdminCommand$1
  #215 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)V
  #216 = Utf8               lambda$useAdminCommand$0
  #217 = Utf8               <clinit>
  #218 = Utf8               SourceFile
  #219 = Utf8               AdminManage.java
  #220 = Utf8               BootstrapMethods
  #221 = MethodType         #222          //  (Ljava/lang/Object;)V
  #222 = Utf8               (Ljava/lang/Object;)V
  #223 = MethodHandle       5:#73         // REF_invokeVirtual ext/mods/gameserver/model/actor/Creature.stopAllEffects:()V
  #224 = MethodType         #91           //  (Lext/mods/gameserver/model/actor/Creature;)V
  #225 = MethodHandle       6:#226        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminManage.lambda$useAdminCommand$0:(Lext/mods/gameserver/model/actor/Creature;)V
  #226 = Methodref          #35.#227      // ext/mods/gameserver/handler/admincommandhandlers/AdminManage.lambda$useAdminCommand$0:(Lext/mods/gameserver/model/actor/Creature;)V
  #227 = NameAndType        #216:#91      // lambda$useAdminCommand$0:(Lext/mods/gameserver/model/actor/Creature;)V
  #228 = MethodHandle       6:#229        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminManage.lambda$useAdminCommand$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)V
  #229 = Methodref          #35.#230      // ext/mods/gameserver/handler/admincommandhandlers/AdminManage.lambda$useAdminCommand$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)V
  #230 = NameAndType        #214:#215     // lambda$useAdminCommand$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)V
  #231 = String             #232          // \u0001 is suicide.
  #232 = Utf8               \u0001 is suicide.
  #233 = MethodHandle       6:#234        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminManage.lambda$useAdminCommand$2:(Lext/mods/gameserver/model/actor/Creature;)V
  #234 = Methodref          #35.#235      // ext/mods/gameserver/handler/admincommandhandlers/AdminManage.lambda$useAdminCommand$2:(Lext/mods/gameserver/model/actor/Creature;)V
  #235 = NameAndType        #212:#91      // lambda$useAdminCommand$2:(Lext/mods/gameserver/model/actor/Creature;)V
  #236 = MethodHandle       6:#237        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #237 = Methodref          #238.#239     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #238 = Class              #240          // java/lang/invoke/LambdaMetafactory
  #239 = NameAndType        #241:#242     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #240 = Utf8               java/lang/invoke/LambdaMetafactory
  #241 = Utf8               metafactory
  #242 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #243 = MethodHandle       6:#244        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #244 = Methodref          #245.#246     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #245 = Class              #247          // java/lang/invoke/StringConcatFactory
  #246 = NameAndType        #112:#248     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #247 = Utf8               java/lang/invoke/StringConcatFactory
  #248 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #249 = Utf8               InnerClasses
  #250 = Class              #251          // java/lang/invoke/MethodHandles$Lookup
  #251 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #252 = Class              #253          // java/lang/invoke/MethodHandles
  #253 = Utf8               java/lang/invoke/MethodHandles
  #254 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminManage();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminManage;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=9, args_size=3
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #9                  // String
         7: invokespecial #11                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore_3
        11: aload_3
        12: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        15: pop
        16: aconst_null
        17: astore        4
        19: iconst_0
        20: istore        5
        22: aload_3
        23: invokevirtual #18                 // Method java/util/StringTokenizer.countTokens:()I
        26: istore        6
        28: iload         6
        30: iconst_2
        31: if_icmpne     52
        34: aload_3
        35: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        38: astore        4
        40: aload_3
        41: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        44: invokestatic  #22                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        47: istore        5
        49: goto          86
        52: iload         6
        54: iconst_1
        55: if_icmpne     86
        58: aload_3
        59: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        62: astore        7
        64: aload         7
        66: invokestatic  #28                 // Method ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
        69: ifeq          82
        72: aload         7
        74: invokestatic  #22                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        77: istore        5
        79: goto          86
        82: aload         7
        84: astore        4
        86: aload_0
        87: aload_2
        88: iconst_1
        89: invokevirtual #34                 // Method getTargetCreature:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Creature;
        92: astore        7
        94: iconst_1
        95: anewarray     #40                 // class java/lang/String
        98: dup
        99: iconst_0
       100: aload         4
       102: aastore
       103: invokestatic  #42                 // Method ext/mods/commons/lang/StringUtil.isEmpty:([Ljava/lang/String;)Z
       106: ifne          128
       109: invokestatic  #46                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       112: aload         4
       114: invokevirtual #52                 // Method ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
       117: astore        8
       119: aload         8
       121: ifnull        128
       124: aload         8
       126: astore        7
       128: aload         7
       130: ifnonnull     141
       133: aload_2
       134: getstatic     #56                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       137: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       140: return
       141: aload_1
       142: ldc           #68                 // String admin_cancel
       144: invokevirtual #70                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       147: ifeq          177
       150: aload         7
       152: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Creature.stopAllEffects:()V
       155: iload         5
       157: ifle          320
       160: aload         7
       162: ldc           #74                 // class ext/mods/gameserver/model/actor/Creature
       164: iload         5
       166: invokedynamic #78,  0             // InvokeDynamic #0:accept:()Ljava/util/function/Consumer;
       171: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Creature.forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
       174: goto          320
       177: aload_1
       178: ldc           #86                 // String admin_heal
       180: invokevirtual #70                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       183: ifeq          213
       186: aload         7
       188: invokestatic  #88                 // Method heal:(Lext/mods/gameserver/model/actor/Creature;)V
       191: iload         5
       193: ifle          320
       196: aload         7
       198: ldc           #74                 // class ext/mods/gameserver/model/actor/Creature
       200: iload         5
       202: invokedynamic #92,  0             // InvokeDynamic #1:accept:()Ljava/util/function/Consumer;
       207: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Creature.forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
       210: goto          320
       213: aload_1
       214: ldc           #93                 // String admin_kill
       216: invokevirtual #70                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       219: ifeq          252
       222: aload         7
       224: aload_2
       225: invokestatic  #95                 // Method kill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)Z
       228: pop
       229: iload         5
       231: ifle          320
       234: aload         7
       236: ldc           #74                 // class ext/mods/gameserver/model/actor/Creature
       238: iload         5
       240: aload_2
       241: invokedynamic #99,  0             // InvokeDynamic #2:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
       246: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Creature.forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
       249: goto          320
       252: aload_1
       253: ldc           #102                // String admin_suicide
       255: invokevirtual #70                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       258: ifeq          287
       261: aload         7
       263: aload_2
       264: invokestatic  #104                // Method suicide:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)Z
       267: ifeq          320
       270: aload_2
       271: aload         7
       273: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
       276: invokedynamic #110,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       281: invokevirtual #114                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       284: goto          320
       287: aload_1
       288: ldc           #118                // String admin_res
       290: invokevirtual #70                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       293: ifeq          320
       296: aload         7
       298: invokestatic  #120                // Method resurrect:(Lext/mods/gameserver/model/actor/Creature;)V
       301: iload         5
       303: ifle          320
       306: aload         7
       308: ldc           #74                 // class ext/mods/gameserver/model/actor/Creature
       310: iload         5
       312: invokedynamic #123,  0            // InvokeDynamic #4:accept:()Ljava/util/function/Consumer;
       317: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Creature.forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
       320: return
      LineNumberTable:
        line 46: 0
        line 47: 11
        line 49: 16
        line 50: 19
        line 52: 22
        line 53: 28
        line 55: 34
        line 56: 40
        line 58: 52
        line 60: 58
        line 61: 64
        line 62: 72
        line 64: 82
        line 67: 86
        line 69: 94
        line 71: 109
        line 72: 119
        line 73: 124
        line 76: 128
        line 78: 133
        line 79: 140
        line 82: 141
        line 84: 150
        line 86: 155
        line 87: 160
        line 89: 177
        line 91: 186
        line 93: 191
        line 94: 196
        line 96: 213
        line 98: 222
        line 100: 229
        line 101: 234
        line 103: 252
        line 105: 261
        line 106: 270
        line 108: 287
        line 110: 296
        line 112: 301
        line 113: 306
        line 115: 320
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           64      22     7 paramToTest   Ljava/lang/String;
          119       9     8 worldPlayer   Lext/mods/gameserver/model/actor/Player;
            0     321     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminManage;
            0     321     1 command   Ljava/lang/String;
            0     321     2 player   Lext/mods/gameserver/model/actor/Player;
           11     310     3    st   Ljava/util/StringTokenizer;
           19     302     4  name   Ljava/lang/String;
           22     299     5 radius   I
           28     293     6 paramCount   I
           94     227     7 targetCreature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminManage, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 3
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 12 /* same */
        frame_type = 35 /* same */
        frame_type = 35 /* same */
        frame_type = 38 /* same */
        frame_type = 34 /* same */
        frame_type = 32 /* same */

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #124                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 120: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminManage;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_5
         1: anewarray     #40                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #68                 // String admin_cancel
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #86                 // String admin_heal
        13: aastore
        14: dup
        15: iconst_2
        16: ldc           #93                 // String admin_kill
        18: aastore
        19: dup
        20: iconst_3
        21: ldc           #102                // String admin_suicide
        23: aastore
        24: dup
        25: iconst_4
        26: ldc           #118                // String admin_res
        28: aastore
        29: putstatic     #124                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        32: return
      LineNumberTable:
        line 34: 0
}
SourceFile: "AdminManage.java"
BootstrapMethods:
  0: #236 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #221 (Ljava/lang/Object;)V
      #223 REF_invokeVirtual ext/mods/gameserver/model/actor/Creature.stopAllEffects:()V
      #224 (Lext/mods/gameserver/model/actor/Creature;)V
  1: #236 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #221 (Ljava/lang/Object;)V
      #225 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminManage.lambda$useAdminCommand$0:(Lext/mods/gameserver/model/actor/Creature;)V
      #224 (Lext/mods/gameserver/model/actor/Creature;)V
  2: #236 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #221 (Ljava/lang/Object;)V
      #228 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminManage.lambda$useAdminCommand$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)V
      #224 (Lext/mods/gameserver/model/actor/Creature;)V
  3: #243 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #231 \u0001 is suicide.
  4: #236 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #221 (Ljava/lang/Object;)V
      #233 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminManage.lambda$useAdminCommand$2:(Lext/mods/gameserver/model/actor/Creature;)V
      #224 (Lext/mods/gameserver/model/actor/Creature;)V
InnerClasses:
  public static final #254= #250 of #252; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
