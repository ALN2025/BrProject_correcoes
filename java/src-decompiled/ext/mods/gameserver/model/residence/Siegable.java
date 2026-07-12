// Bytecode for: ext.mods.gameserver.model.residence.Siegable
// File: ext\mods\gameserver\model\residence\Siegable.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/residence/Siegable.class
  Last modified 9 de jul de 2026; size 750 bytes
  MD5 checksum f88ccb1e38833320ed3cf5e9568e9401
  Compiled from "Siegable.java"
public interface ext.mods.gameserver.model.residence.Siegable
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/gameserver/model/residence/Siegable
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 9, attributes: 1
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/model/residence/Siegable
   #2 = Utf8               ext/mods/gameserver/model/residence/Siegable
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               startSiege
   #6 = Utf8               ()V
   #7 = Utf8               endSiege
   #8 = Utf8               getAttackerClans
   #9 = Utf8               ()Ljava/util/List;
  #10 = Utf8               Signature
  #11 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/pledge/Clan;>;
  #12 = Utf8               getDefenderClans
  #13 = Utf8               checkSide
  #14 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
  #15 = Utf8               checkSides
  #16 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
  #17 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Z
  #18 = Utf8               getFlag
  #19 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/actor/Npc;
  #20 = Utf8               getSiegeDate
  #21 = Utf8               ()Ljava/util/Calendar;
  #22 = Utf8               SourceFile
  #23 = Utf8               Siegable.java
{
  public abstract void startSiege();
    descriptor: ()V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void endSiege();
    descriptor: ()V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract java.util.List<ext.mods.gameserver.model.pledge.Clan> getAttackerClans();
    descriptor: ()Ljava/util/List;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
    Signature: #11                          // ()Ljava/util/List<Lext/mods/gameserver/model/pledge/Clan;>;

  public abstract java.util.List<ext.mods.gameserver.model.pledge.Clan> getDefenderClans();
    descriptor: ()Ljava/util/List;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
    Signature: #11                          // ()Ljava/util/List<Lext/mods/gameserver/model/pledge/Clan;>;

  public abstract boolean checkSide(ext.mods.gameserver.model.pledge.Clan, ext.mods.gameserver.enums.SiegeSide);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract boolean checkSides(ext.mods.gameserver.model.pledge.Clan, ext.mods.gameserver.enums.SiegeSide...);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
    flags: (0x0481) ACC_PUBLIC, ACC_VARARGS, ACC_ABSTRACT

  public abstract boolean checkSides(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract ext.mods.gameserver.model.actor.Npc getFlag(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/actor/Npc;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract java.util.Calendar getSiegeDate();
    descriptor: ()Ljava/util/Calendar;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "Siegable.java"
