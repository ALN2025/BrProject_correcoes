// Bytecode for: ext.mods.dungeon.DungeonTemplate
// File: ext\mods\dungeon\DungeonTemplate.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/dungeon/DungeonTemplate.class
  Last modified 9 de jul de 2026; size 1297 bytes
  MD5 checksum f4cba74cb99e2538f66754791929266c
  Compiled from "DungeonTemplate.java"
public class ext.mods.dungeon.DungeonTemplate
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/dungeon/DungeonTemplate
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 7, methods: 1, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/dungeon/DungeonTemplate.id:I
   #8 = Class              #10            // ext/mods/dungeon/DungeonTemplate
   #9 = NameAndType        #11:#12        // id:I
  #10 = Utf8               ext/mods/dungeon/DungeonTemplate
  #11 = Utf8               id
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/dungeon/DungeonTemplate.name:Ljava/lang/String;
  #14 = NameAndType        #15:#16        // name:Ljava/lang/String;
  #15 = Utf8               name
  #16 = Utf8               Ljava/lang/String;
  #17 = Fieldref           #8.#18         // ext/mods/dungeon/DungeonTemplate.type:Lext/mods/dungeon/enums/DungeonType;
  #18 = NameAndType        #19:#20        // type:Lext/mods/dungeon/enums/DungeonType;
  #19 = Utf8               type
  #20 = Utf8               Lext/mods/dungeon/enums/DungeonType;
  #21 = Fieldref           #8.#22         // ext/mods/dungeon/DungeonTemplate.sharedInstance:Z
  #22 = NameAndType        #23:#24        // sharedInstance:Z
  #23 = Utf8               sharedInstance
  #24 = Utf8               Z
  #25 = Fieldref           #8.#26         // ext/mods/dungeon/DungeonTemplate.cooldown:J
  #26 = NameAndType        #27:#28        // cooldown:J
  #27 = Utf8               cooldown
  #28 = Utf8               J
  #29 = Fieldref           #8.#30         // ext/mods/dungeon/DungeonTemplate.stages:Ljava/util/List;
  #30 = NameAndType        #31:#32        // stages:Ljava/util/List;
  #31 = Utf8               stages
  #32 = Utf8               Ljava/util/List;
  #33 = Fieldref           #8.#34         // ext/mods/dungeon/DungeonTemplate.spawns:Ljava/util/Map;
  #34 = NameAndType        #35:#36        // spawns:Ljava/util/Map;
  #35 = Utf8               spawns
  #36 = Utf8               Ljava/util/Map;
  #37 = Utf8               Signature
  #38 = Utf8               Ljava/util/List<Lext/mods/dungeon/holder/StageTemplate;>;
  #39 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lext/mods/dungeon/holder/SpawnTemplate;>;>;
  #40 = Utf8               (ILjava/lang/String;Lext/mods/dungeon/enums/DungeonType;ZJLjava/util/List;Ljava/util/Map;)V
  #41 = Utf8               Code
  #42 = Utf8               LineNumberTable
  #43 = Utf8               LocalVariableTable
  #44 = Utf8               this
  #45 = Utf8               Lext/mods/dungeon/DungeonTemplate;
  #46 = Utf8               LocalVariableTypeTable
  #47 = Utf8               (ILjava/lang/String;Lext/mods/dungeon/enums/DungeonType;ZJLjava/util/List<Lext/mods/dungeon/holder/StageTemplate;>;Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lext/mods/dungeon/holder/SpawnTemplate;>;>;)V
  #48 = Utf8               SourceFile
  #49 = Utf8               DungeonTemplate.java
{
  public final int id;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final java.lang.String name;
    descriptor: Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final ext.mods.dungeon.enums.DungeonType type;
    descriptor: Lext/mods/dungeon/enums/DungeonType;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final boolean sharedInstance;
    descriptor: Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final long cooldown;
    descriptor: J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final java.util.List<ext.mods.dungeon.holder.StageTemplate> stages;
    descriptor: Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Signature: #38                          // Ljava/util/List<Lext/mods/dungeon/holder/StageTemplate;>;

  public final java.util.Map<java.lang.Integer, java.util.List<ext.mods.dungeon.holder.SpawnTemplate>> spawns;
    descriptor: Ljava/util/Map;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Signature: #39                          // Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lext/mods/dungeon/holder/SpawnTemplate;>;>;

  public ext.mods.dungeon.DungeonTemplate(int, java.lang.String, ext.mods.dungeon.enums.DungeonType, boolean, long, java.util.List<ext.mods.dungeon.holder.StageTemplate>, java.util.Map<java.lang.Integer, java.util.List<ext.mods.dungeon.holder.SpawnTemplate>>);
    descriptor: (ILjava/lang/String;Lext/mods/dungeon/enums/DungeonType;ZJLjava/util/List;Ljava/util/Map;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=9, args_size=8
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field id:I
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field name:Ljava/lang/String;
        14: aload_0
        15: aload_3
        16: putfield      #17                 // Field type:Lext/mods/dungeon/enums/DungeonType;
        19: aload_0
        20: iload         4
        22: putfield      #21                 // Field sharedInstance:Z
        25: aload_0
        26: lload         5
        28: putfield      #25                 // Field cooldown:J
        31: aload_0
        32: aload         7
        34: putfield      #29                 // Field stages:Ljava/util/List;
        37: aload_0
        38: aload         8
        40: putfield      #33                 // Field spawns:Ljava/util/Map;
        43: return
      LineNumberTable:
        line 40: 0
        line 41: 4
        line 42: 9
        line 43: 14
        line 44: 19
        line 45: 25
        line 46: 31
        line 47: 37
        line 48: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/dungeon/DungeonTemplate;
            0      44     1    id   I
            0      44     2  name   Ljava/lang/String;
            0      44     3  type   Lext/mods/dungeon/enums/DungeonType;
            0      44     4 sharedInstance   Z
            0      44     5 cooldown   J
            0      44     7 stages   Ljava/util/List;
            0      44     8 spawns   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      44     7 stages   Ljava/util/List<Lext/mods/dungeon/holder/StageTemplate;>;
            0      44     8 spawns   Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lext/mods/dungeon/holder/SpawnTemplate;>;>;
    Signature: #47                          // (ILjava/lang/String;Lext/mods/dungeon/enums/DungeonType;ZJLjava/util/List<Lext/mods/dungeon/holder/StageTemplate;>;Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lext/mods/dungeon/holder/SpawnTemplate;>;>;)V
}
SourceFile: "DungeonTemplate.java"
