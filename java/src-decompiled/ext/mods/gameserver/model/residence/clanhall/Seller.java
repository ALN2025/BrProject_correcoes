// Bytecode for: ext.mods.gameserver.model.residence.clanhall.Seller
// File: ext\mods\gameserver\model\residence\clanhall\Seller.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/residence/clanhall/Seller.class
  Last modified 9 de jul de 2026; size 1226 bytes
  MD5 checksum e238938d7f71f3d51142c949eb8e7d4f
  Compiled from "Seller.java"
public class ext.mods.gameserver.model.residence.clanhall.Seller
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/residence/clanhall/Seller
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 6, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/residence/clanhall/Seller._name:Ljava/lang/String;
   #8 = Class              #10            // ext/mods/gameserver/model/residence/clanhall/Seller
   #9 = NameAndType        #11:#12        // _name:Ljava/lang/String;
  #10 = Utf8               ext/mods/gameserver/model/residence/clanhall/Seller
  #11 = Utf8               _name
  #12 = Utf8               Ljava/lang/String;
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/residence/clanhall/Seller._clanName:Ljava/lang/String;
  #14 = NameAndType        #15:#12        // _clanName:Ljava/lang/String;
  #15 = Utf8               _clanName
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/residence/clanhall/Seller._bid:I
  #17 = NameAndType        #18:#19        // _bid:I
  #18 = Utf8               _bid
  #19 = Utf8               I
  #20 = Methodref          #21.#22        // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #21 = Class              #23            // ext/mods/gameserver/data/sql/ClanTable
  #22 = NameAndType        #24:#25        // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #23 = Utf8               ext/mods/gameserver/data/sql/ClanTable
  #24 = Utf8               getInstance
  #25 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
  #26 = Methodref          #21.#27        // ext/mods/gameserver/data/sql/ClanTable.getClanByName:(Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
  #27 = NameAndType        #28:#29        // getClanByName:(Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
  #28 = Utf8               getClanByName
  #29 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
  #30 = Utf8               (Ljava/lang/String;Ljava/lang/String;I)V
  #31 = Utf8               Code
  #32 = Utf8               LineNumberTable
  #33 = Utf8               LocalVariableTable
  #34 = Utf8               this
  #35 = Utf8               Lext/mods/gameserver/model/residence/clanhall/Seller;
  #36 = Utf8               name
  #37 = Utf8               clanName
  #38 = Utf8               bid
  #39 = Utf8               getName
  #40 = Utf8               ()Ljava/lang/String;
  #41 = Utf8               getClanName
  #42 = Utf8               getBid
  #43 = Utf8               ()I
  #44 = Utf8               setBid
  #45 = Utf8               (I)V
  #46 = Utf8               getClan
  #47 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #48 = Utf8               SourceFile
  #49 = Utf8               Seller.java
{
  public ext.mods.gameserver.model.residence.clanhall.Seller(java.lang.String, java.lang.String, int);
    descriptor: (Ljava/lang/String;Ljava/lang/String;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _name:Ljava/lang/String;
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field _clanName:Ljava/lang/String;
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field _bid:I
        19: return
      LineNumberTable:
        line 36: 0
        line 37: 4
        line 38: 9
        line 39: 14
        line 40: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/residence/clanhall/Seller;
            0      20     1  name   Ljava/lang/String;
            0      20     2 clanName   Ljava/lang/String;
            0      20     3   bid   I

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/Seller;

  public java.lang.String getClanName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _clanName:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/Seller;

  public int getBid();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _bid:I
         4: ireturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/Seller;

  public void setBid(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #16                 // Field _bid:I
         5: return
      LineNumberTable:
        line 59: 0
        line 60: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/residence/clanhall/Seller;
            0       6     1   bid   I

  public ext.mods.gameserver.model.pledge.Clan getClan();
    descriptor: ()Lext/mods/gameserver/model/pledge/Clan;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: invokestatic  #20                 // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
         3: aload_0
         4: getfield      #13                 // Field _clanName:Ljava/lang/String;
         7: invokevirtual #26                 // Method ext/mods/gameserver/data/sql/ClanTable.getClanByName:(Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
        10: areturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/residence/clanhall/Seller;
}
SourceFile: "Seller.java"
