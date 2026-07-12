// Bytecode for: ext.mods.gameserver.custom.data.DonateData$1
// File: ext\mods\gameserver\custom\data\DonateData$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/custom/data/DonateData$1.class
  Last modified 9 de jul de 2026; size 1292 bytes
  MD5 checksum 2e3e4833b24920a4092da44cf6620daa
  Compiled from "DonateData.java"
class ext.mods.gameserver.custom.data.DonateData$1 implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/custom/data/DonateData$1
  super_class: #8                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 2, attributes: 4
Constant pool:
   #1 = Fieldref           #2.#3          // ext/mods/gameserver/custom/data/DonateData$1.val$player:Lext/mods/gameserver/model/actor/Player;
   #2 = Class              #4             // ext/mods/gameserver/custom/data/DonateData$1
   #3 = NameAndType        #5:#6          // val$player:Lext/mods/gameserver/model/actor/Player;
   #4 = Utf8               ext/mods/gameserver/custom/data/DonateData$1
   #5 = Utf8               val$player
   #6 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #7 = Methodref          #8.#9          // java/lang/Object."<init>":()V
   #8 = Class              #10            // java/lang/Object
   #9 = NameAndType        #11:#12        // "<init>":()V
  #10 = Utf8               java/lang/Object
  #11 = Utf8               <init>
  #12 = Utf8               ()V
  #13 = Methodref          #14.#15        // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #14 = Class              #16            // ext/mods/gameserver/model/actor/Player
  #15 = NameAndType        #17:#18        // isOnline:()Z
  #16 = Utf8               ext/mods/gameserver/model/actor/Player
  #17 = Utf8               isOnline
  #18 = Utf8               ()Z
  #19 = Methodref          #14.#20        // ext/mods/gameserver/model/actor/Player.isHero:()Z
  #20 = NameAndType        #21:#18        // isHero:()Z
  #21 = Utf8               isHero
  #22 = Methodref          #14.#23        // ext/mods/gameserver/model/actor/Player.setHero:(Z)V
  #23 = NameAndType        #24:#25        // setHero:(Z)V
  #24 = Utf8               setHero
  #25 = Utf8               (Z)V
  #26 = Methodref          #14.#27        // ext/mods/gameserver/model/actor/Player.setHeroUntil:(J)V
  #27 = NameAndType        #28:#29        // setHeroUntil:(J)V
  #28 = Utf8               setHeroUntil
  #29 = Utf8               (J)V
  #30 = Methodref          #14.#31        // ext/mods/gameserver/model/actor/Player.store:()V
  #31 = NameAndType        #32:#12        // store:()V
  #32 = Utf8               store
  #33 = Methodref          #14.#34        // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #34 = NameAndType        #35:#12        // broadcastUserInfo:()V
  #35 = Utf8               broadcastUserInfo
  #36 = Methodref          #14.#37        // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #37 = NameAndType        #38:#39        // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #38 = Utf8               getSysString
  #39 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #40 = Methodref          #14.#41        // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #41 = NameAndType        #42:#43        // sendMessage:(Ljava/lang/String;)V
  #42 = Utf8               sendMessage
  #43 = Utf8               (Ljava/lang/String;)V
  #44 = Class              #45            // java/lang/Runnable
  #45 = Utf8               java/lang/Runnable
  #46 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #47 = Utf8               Code
  #48 = Utf8               LineNumberTable
  #49 = Utf8               LocalVariableTable
  #50 = Utf8               this
  #51 = Utf8               Lext/mods/gameserver/custom/data/DonateData$1;
  #52 = Utf8               Signature
  #53 = Utf8               run
  #54 = Utf8               StackMapTable
  #55 = Utf8               SourceFile
  #56 = Utf8               DonateData.java
  #57 = Utf8               EnclosingMethod
  #58 = Class              #59            // ext/mods/gameserver/custom/data/DonateData
  #59 = Utf8               ext/mods/gameserver/custom/data/DonateData
  #60 = NameAndType        #24:#61        // setHero:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #61 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/custom/data/DonateData$Donate;)V
  #62 = Utf8               NestHost
  #63 = Utf8               InnerClasses
  #64 = Class              #65            // ext/mods/gameserver/custom/data/DonateData$Donate
  #65 = Utf8               ext/mods/gameserver/custom/data/DonateData$Donate
  #66 = Utf8               Donate
{
  final ext.mods.gameserver.model.actor.Player val$player;
    descriptor: Lext/mods/gameserver/model/actor/Player;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.gameserver.custom.data.DonateData$1();
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0000)
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #1                  // Field val$player:Lext/mods/gameserver/model/actor/Player;
         5: aload_0
         6: invokespecial #7                  // Method java/lang/Object."<init>":()V
         9: return
      LineNumberTable:
        line 186: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/custom/data/DonateData$1;
    Signature: #12                          // ()V

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #1                  // Field val$player:Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
         7: ifeq          71
        10: aload_0
        11: getfield      #1                  // Field val$player:Lext/mods/gameserver/model/actor/Player;
        14: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.isHero:()Z
        17: ifeq          71
        20: aload_0
        21: getfield      #1                  // Field val$player:Lext/mods/gameserver/model/actor/Player;
        24: iconst_0
        25: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Player.setHero:(Z)V
        28: aload_0
        29: getfield      #1                  // Field val$player:Lext/mods/gameserver/model/actor/Player;
        32: lconst_0
        33: invokevirtual #26                 // Method ext/mods/gameserver/model/actor/Player.setHeroUntil:(J)V
        36: aload_0
        37: getfield      #1                  // Field val$player:Lext/mods/gameserver/model/actor/Player;
        40: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.store:()V
        43: aload_0
        44: getfield      #1                  // Field val$player:Lext/mods/gameserver/model/actor/Player;
        47: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        50: aload_0
        51: getfield      #1                  // Field val$player:Lext/mods/gameserver/model/actor/Player;
        54: aload_0
        55: getfield      #1                  // Field val$player:Lext/mods/gameserver/model/actor/Player;
        58: sipush        10025
        61: iconst_0
        62: anewarray     #8                  // class java/lang/Object
        65: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        68: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        71: return
      LineNumberTable:
        line 190: 0
        line 192: 20
        line 193: 28
        line 194: 36
        line 195: 43
        line 196: 50
        line 198: 71
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      72     0  this   Lext/mods/gameserver/custom/data/DonateData$1;
      StackMapTable: number_of_entries = 1
        frame_type = 251 /* same_frame_extended */
          offset_delta = 71
}
SourceFile: "DonateData.java"
EnclosingMethod: #58.#60                // ext.mods.gameserver.custom.data.DonateData.setHero
NestHost: class ext/mods/gameserver/custom/data/DonateData
InnerClasses:
  #2;                                     // class ext/mods/gameserver/custom/data/DonateData$1
  public static final #66= #64 of #58;    // Donate=class ext/mods/gameserver/custom/data/DonateData$Donate of class ext/mods/gameserver/custom/data/DonateData
