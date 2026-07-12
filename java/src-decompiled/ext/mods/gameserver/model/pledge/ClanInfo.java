// Bytecode for: ext.mods.gameserver.model.pledge.ClanInfo
// File: ext\mods\gameserver\model\pledge\ClanInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/pledge/ClanInfo.class
  Last modified 9 de jul de 2026; size 912 bytes
  MD5 checksum 7358c6abb11562e76929006fa51c80f5
  Compiled from "ClanInfo.java"
public class ext.mods.gameserver.model.pledge.ClanInfo
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/pledge/ClanInfo
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/pledge/ClanInfo._clan:Lext/mods/gameserver/model/pledge/Clan;
   #8 = Class              #10            // ext/mods/gameserver/model/pledge/ClanInfo
   #9 = NameAndType        #11:#12        // _clan:Lext/mods/gameserver/model/pledge/Clan;
  #10 = Utf8               ext/mods/gameserver/model/pledge/ClanInfo
  #11 = Utf8               _clan
  #12 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #13 = Methodref          #14.#15        // ext/mods/gameserver/model/pledge/Clan.getMembersCount:()I
  #14 = Class              #16            // ext/mods/gameserver/model/pledge/Clan
  #15 = NameAndType        #17:#18        // getMembersCount:()I
  #16 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #17 = Utf8               getMembersCount
  #18 = Utf8               ()I
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/model/pledge/ClanInfo._total:I
  #20 = NameAndType        #21:#22        // _total:I
  #21 = Utf8               _total
  #22 = Utf8               I
  #23 = Methodref          #14.#24        // ext/mods/gameserver/model/pledge/Clan.getOnlineMembersCount:()I
  #24 = NameAndType        #25:#18        // getOnlineMembersCount:()I
  #25 = Utf8               getOnlineMembersCount
  #26 = Fieldref           #8.#27         // ext/mods/gameserver/model/pledge/ClanInfo._online:I
  #27 = NameAndType        #28:#22        // _online:I
  #28 = Utf8               _online
  #29 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)V
  #30 = Utf8               Code
  #31 = Utf8               LineNumberTable
  #32 = Utf8               LocalVariableTable
  #33 = Utf8               this
  #34 = Utf8               Lext/mods/gameserver/model/pledge/ClanInfo;
  #35 = Utf8               clan
  #36 = Utf8               getClan
  #37 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #38 = Utf8               getTotal
  #39 = Utf8               getOnline
  #40 = Utf8               SourceFile
  #41 = Utf8               ClanInfo.java
{
  public ext.mods.gameserver.model.pledge.ClanInfo(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _clan:Lext/mods/gameserver/model/pledge/Clan;
         9: aload_0
        10: aload_1
        11: invokevirtual #13                 // Method ext/mods/gameserver/model/pledge/Clan.getMembersCount:()I
        14: putfield      #19                 // Field _total:I
        17: aload_0
        18: aload_1
        19: invokevirtual #23                 // Method ext/mods/gameserver/model/pledge/Clan.getOnlineMembersCount:()I
        22: putfield      #26                 // Field _online:I
        25: return
      LineNumberTable:
        line 27: 0
        line 28: 4
        line 29: 9
        line 30: 17
        line 31: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/pledge/ClanInfo;
            0      26     1  clan   Lext/mods/gameserver/model/pledge/Clan;

  public ext.mods.gameserver.model.pledge.Clan getClan();
    descriptor: ()Lext/mods/gameserver/model/pledge/Clan;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _clan:Lext/mods/gameserver/model/pledge/Clan;
         4: areturn
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/ClanInfo;

  public int getTotal();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _total:I
         4: ireturn
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/ClanInfo;

  public int getOnline();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field _online:I
         4: ireturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/pledge/ClanInfo;
}
SourceFile: "ClanInfo.java"
