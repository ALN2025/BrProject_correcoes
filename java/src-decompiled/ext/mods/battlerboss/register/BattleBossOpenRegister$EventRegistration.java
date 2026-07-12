// Bytecode for: ext.mods.battlerboss.register.BattleBossOpenRegister$EventRegistration
// File: ext\mods\battlerboss\register\BattleBossOpenRegister$EventRegistration.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration.class
  Last modified 9 de jul de 2026; size 886 bytes
  MD5 checksum 8d1ac13a89ac121aa104c79f652797ed
  Compiled from "BattleBossOpenRegister.java"
class ext.mods.battlerboss.register.BattleBossOpenRegister$EventRegistration
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #11                         // ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 1, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // java/util/concurrent/CopyOnWriteArrayList
   #8 = Utf8               java/util/concurrent/CopyOnWriteArrayList
   #9 = Methodref          #7.#3          // java/util/concurrent/CopyOnWriteArrayList."<init>":()V
  #10 = Fieldref           #11.#12        // ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration.registeredPlayers:Ljava/util/List;
  #11 = Class              #13            // ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration
  #12 = NameAndType        #14:#15        // registeredPlayers:Ljava/util/List;
  #13 = Utf8               ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration
  #14 = Utf8               registeredPlayers
  #15 = Utf8               Ljava/util/List;
  #16 = Fieldref           #11.#17        // ext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration.registrationOpen:Z
  #17 = NameAndType        #18:#19        // registrationOpen:Z
  #18 = Utf8               registrationOpen
  #19 = Utf8               Z
  #20 = Utf8               Signature
  #21 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #22 = Utf8               matchChecker
  #23 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #24 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #25 = Utf8               Code
  #26 = Utf8               LineNumberTable
  #27 = Utf8               LocalVariableTable
  #28 = Utf8               this
  #29 = Utf8               Lext/mods/battlerboss/register/BattleBossOpenRegister$EventRegistration;
  #30 = Utf8               SourceFile
  #31 = Utf8               BattleBossOpenRegister.java
  #32 = Utf8               NestHost
  #33 = Class              #34            // ext/mods/battlerboss/register/BattleBossOpenRegister
  #34 = Utf8               ext/mods/battlerboss/register/BattleBossOpenRegister
  #35 = Utf8               InnerClasses
  #36 = Utf8               EventRegistration
{
  final java.util.List<ext.mods.gameserver.model.actor.Player> registeredPlayers;
    descriptor: Ljava/util/List;
    flags: (0x0010) ACC_FINAL
    Signature: #21                          // Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;

  volatile boolean registrationOpen;
    descriptor: Z
    flags: (0x0040) ACC_VOLATILE

  java.util.concurrent.ScheduledFuture<?> matchChecker;
    descriptor: Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0000)
    Signature: #24                          // Ljava/util/concurrent/ScheduledFuture<*>;

}
SourceFile: "BattleBossOpenRegister.java"
NestHost: class ext/mods/battlerboss/register/BattleBossOpenRegister
