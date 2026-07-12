// Bytecode for: ext.mods.gameserver.data.sql.PlayerInfoTable$PlayerInfo
// File: ext\mods\gameserver\data\sql\PlayerInfoTable$PlayerInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/sql/PlayerInfoTable$PlayerInfo.class
  Last modified 9 de jul de 2026; size 1396 bytes
  MD5 checksum 8e675126d2bb61ef7649e556cc72f2a9
  Compiled from "PlayerInfoTable.java"
final class ext.mods.gameserver.data.sql.PlayerInfoTable$PlayerInfo
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/data/sql/PlayerInfoTable$PlayerInfo
  super_class: #8                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 6, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Methodref          #8.#9          // java/lang/Object."<init>":()V
   #8 = Class              #10            // java/lang/Object
   #9 = NameAndType        #11:#12        // "<init>":()V
  #10 = Utf8               java/lang/Object
  #11 = Utf8               <init>
  #12 = Utf8               ()V
  #13 = Fieldref           #14.#15        // ext/mods/gameserver/data/sql/PlayerInfoTable$PlayerInfo._accountName:Ljava/lang/String;
  #14 = Class              #16            // ext/mods/gameserver/data/sql/PlayerInfoTable$PlayerInfo
  #15 = NameAndType        #17:#18        // _accountName:Ljava/lang/String;
  #16 = Utf8               ext/mods/gameserver/data/sql/PlayerInfoTable$PlayerInfo
  #17 = Utf8               _accountName
  #18 = Utf8               Ljava/lang/String;
  #19 = Fieldref           #14.#20        // ext/mods/gameserver/data/sql/PlayerInfoTable$PlayerInfo._playerName:Ljava/lang/String;
  #20 = NameAndType        #21:#18        // _playerName:Ljava/lang/String;
  #21 = Utf8               _playerName
  #22 = Fieldref           #14.#23        // ext/mods/gameserver/data/sql/PlayerInfoTable$PlayerInfo._accessLevel:I
  #23 = NameAndType        #24:#25        // _accessLevel:I
  #24 = Utf8               _accessLevel
  #25 = Utf8               I
  #26 = Utf8               (Lext/mods/gameserver/data/sql/PlayerInfoTable;Ljava/lang/String;Ljava/lang/String;I)V
  #27 = Utf8               Code
  #28 = Utf8               LineNumberTable
  #29 = Utf8               LocalVariableTable
  #30 = Utf8               this
  #31 = Utf8               Lext/mods/gameserver/data/sql/PlayerInfoTable$PlayerInfo;
  #32 = Utf8               accountName
  #33 = Utf8               playerName
  #34 = Utf8               accessLevel
  #35 = Utf8               MethodParameters
  #36 = Utf8               getAccountName
  #37 = Utf8               ()Ljava/lang/String;
  #38 = Utf8               getPlayerName
  #39 = Utf8               getAccessLevel
  #40 = Utf8               ()I
  #41 = Utf8               setPlayerName
  #42 = Utf8               (Ljava/lang/String;)V
  #43 = Utf8               setAccessLevel
  #44 = Utf8               (I)V
  #45 = Utf8               SourceFile
  #46 = Utf8               PlayerInfoTable.java
  #47 = Utf8               NestHost
  #48 = Class              #49            // ext/mods/gameserver/data/sql/PlayerInfoTable
  #49 = Utf8               ext/mods/gameserver/data/sql/PlayerInfoTable
  #50 = Utf8               InnerClasses
  #51 = Utf8               PlayerInfo
{
  public ext.mods.gameserver.data.sql.PlayerInfoTable$PlayerInfo(ext.mods.gameserver.data.sql.PlayerInfoTable, java.lang.String, java.lang.String, int);
    descriptor: (Lext/mods/gameserver/data/sql/PlayerInfoTable;Ljava/lang/String;Ljava/lang/String;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_1
         1: dup
         2: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         5: pop
         6: pop
         7: aload_0
         8: invokespecial #7                  // Method java/lang/Object."<init>":()V
        11: aload_0
        12: aload_2
        13: putfield      #13                 // Field _accountName:Ljava/lang/String;
        16: aload_0
        17: aload_3
        18: putfield      #19                 // Field _playerName:Ljava/lang/String;
        21: aload_0
        22: iload         4
        24: putfield      #22                 // Field _accessLevel:I
        27: return
      LineNumberTable:
        line 164: 0
        line 165: 11
        line 166: 16
        line 167: 21
        line 168: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/data/sql/PlayerInfoTable$PlayerInfo;
            0      28     2 accountName   Ljava/lang/String;
            0      28     3 playerName   Ljava/lang/String;
            0      28     4 accessLevel   I
    MethodParameters:
      Name                           Flags
      <no name>                      final synthetic
      <no name>
      <no name>
      <no name>

  public final java.lang.String getAccountName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _accountName:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 172: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/sql/PlayerInfoTable$PlayerInfo;

  public final java.lang.String getPlayerName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _playerName:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 177: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/sql/PlayerInfoTable$PlayerInfo;

  public final int getAccessLevel();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _accessLevel:I
         4: ireturn
      LineNumberTable:
        line 182: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/sql/PlayerInfoTable$PlayerInfo;

  public final void setPlayerName(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #19                 // Field _playerName:Ljava/lang/String;
         5: return
      LineNumberTable:
        line 187: 0
        line 188: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/data/sql/PlayerInfoTable$PlayerInfo;
            0       6     1 playerName   Ljava/lang/String;

  public final void setAccessLevel(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #22                 // Field _accessLevel:I
         5: return
      LineNumberTable:
        line 192: 0
        line 193: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/data/sql/PlayerInfoTable$PlayerInfo;
            0       6     1 accessLevel   I
}
SourceFile: "PlayerInfoTable.java"
NestHost: class ext/mods/gameserver/data/sql/PlayerInfoTable
