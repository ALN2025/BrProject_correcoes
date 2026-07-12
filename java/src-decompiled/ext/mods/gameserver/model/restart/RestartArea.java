// Bytecode for: ext.mods.gameserver.model.restart.RestartArea
// File: ext\mods\gameserver\model\restart\RestartArea.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/restart/RestartArea.class
  Last modified 9 de jul de 2026; size 1338 bytes
  MD5 checksum daff20602047bcfd0f7004f3b32757d9
  Compiled from "RestartArea.java"
public class ext.mods.gameserver.model.restart.RestartArea extends ext.mods.commons.geometry.Territory
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #18                         // ext/mods/gameserver/model/restart/RestartArea
  super_class: #2                         // ext/mods/commons/geometry/Territory
  interfaces: 0, fields: 1, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/commons/geometry/Territory."<init>":(Lext/mods/commons/data/StatSet;)V
   #2 = Class              #4             // ext/mods/commons/geometry/Territory
   #3 = NameAndType        #5:#6          // "<init>":(Lext/mods/commons/data/StatSet;)V
   #4 = Utf8               ext/mods/commons/geometry/Territory
   #5 = Utf8               <init>
   #6 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #7 = String             #8             // classRestrictions
   #8 = Utf8               classRestrictions
   #9 = Class              #10            // java/util/EnumMap
  #10 = Utf8               java/util/EnumMap
  #11 = Methodref          #12.#13        // ext/mods/commons/data/StatSet.getObject:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
  #12 = Class              #14            // ext/mods/commons/data/StatSet
  #13 = NameAndType        #15:#16        // getObject:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
  #14 = Utf8               ext/mods/commons/data/StatSet
  #15 = Utf8               getObject
  #16 = Utf8               (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
  #17 = Fieldref           #18.#19        // ext/mods/gameserver/model/restart/RestartArea._classRestrictions:Ljava/util/EnumMap;
  #18 = Class              #20            // ext/mods/gameserver/model/restart/RestartArea
  #19 = NameAndType        #21:#22        // _classRestrictions:Ljava/util/EnumMap;
  #20 = Utf8               ext/mods/gameserver/model/restart/RestartArea
  #21 = Utf8               _classRestrictions
  #22 = Utf8               Ljava/util/EnumMap;
  #23 = Methodref          #24.#25        // ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #24 = Class              #26            // ext/mods/gameserver/model/actor/Player
  #25 = NameAndType        #27:#28        // getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #26 = Utf8               ext/mods/gameserver/model/actor/Player
  #27 = Utf8               getTemplate
  #28 = Utf8               ()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #29 = Methodref          #30.#31        // ext/mods/gameserver/model/actor/template/PlayerTemplate.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
  #30 = Class              #32            // ext/mods/gameserver/model/actor/template/PlayerTemplate
  #31 = NameAndType        #33:#34        // getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
  #32 = Utf8               ext/mods/gameserver/model/actor/template/PlayerTemplate
  #33 = Utf8               getRace
  #34 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassRace;
  #35 = Methodref          #9.#36         // java/util/EnumMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #36 = NameAndType        #37:#38        // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #37 = Utf8               get
  #38 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #39 = Class              #40            // java/lang/String
  #40 = Utf8               java/lang/String
  #41 = Utf8               Signature
  #42 = Utf8               Ljava/util/EnumMap<Lext/mods/gameserver/enums/actors/ClassRace;Ljava/lang/String;>;
  #43 = Utf8               Code
  #44 = Utf8               LineNumberTable
  #45 = Utf8               LocalVariableTable
  #46 = Utf8               this
  #47 = Utf8               Lext/mods/gameserver/model/restart/RestartArea;
  #48 = Utf8               set
  #49 = Utf8               Lext/mods/commons/data/StatSet;
  #50 = Utf8               getClassRestriction
  #51 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #52 = Utf8               player
  #53 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #54 = Utf8               SourceFile
  #55 = Utf8               RestartArea.java
{
  public ext.mods.gameserver.model.restart.RestartArea(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/commons/geometry/Territory."<init>":(Lext/mods/commons/data/StatSet;)V
         5: aload_0
         6: aload_1
         7: ldc           #7                  // String classRestrictions
         9: ldc           #9                  // class java/util/EnumMap
        11: invokevirtual #11                 // Method ext/mods/commons/data/StatSet.getObject:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        14: checkcast     #9                  // class java/util/EnumMap
        17: putfield      #17                 // Field _classRestrictions:Ljava/util/EnumMap;
        20: return
      LineNumberTable:
        line 40: 0
        line 42: 5
        line 43: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/restart/RestartArea;
            0      21     1   set   Lext/mods/commons/data/StatSet;

  public java.lang.String getClassRestriction(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #17                 // Field _classRestrictions:Ljava/util/EnumMap;
         4: aload_1
         5: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
         8: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
        11: invokevirtual #35                 // Method java/util/EnumMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        14: checkcast     #39                 // class java/lang/String
        17: areturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/restart/RestartArea;
            0      18     1 player   Lext/mods/gameserver/model/actor/Player;
}
SourceFile: "RestartArea.java"
