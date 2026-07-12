// Bytecode for: ext.mods.gameserver.model.Mission
// File: ext\mods\gameserver\model\Mission.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/Mission.class
  Last modified 9 de jul de 2026; size 1699 bytes
  MD5 checksum e825f6556b62daaae824d408c9d49ab2
  Compiled from "Mission.java"
public class ext.mods.gameserver.model.Mission
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/model/Mission
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 7, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = String             #8             // level
   #8 = Utf8               level
   #9 = Methodref          #10.#11        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
  #10 = Class              #12            // ext/mods/commons/data/StatSet
  #11 = NameAndType        #13:#14        // getInteger:(Ljava/lang/String;I)I
  #12 = Utf8               ext/mods/commons/data/StatSet
  #13 = Utf8               getInteger
  #14 = Utf8               (Ljava/lang/String;I)I
  #15 = Fieldref           #16.#17        // ext/mods/gameserver/model/Mission._level:I
  #16 = Class              #18            // ext/mods/gameserver/model/Mission
  #17 = NameAndType        #19:#20        // _level:I
  #18 = Utf8               ext/mods/gameserver/model/Mission
  #19 = Utf8               _level
  #20 = Utf8               I
  #21 = String             #22            // name
  #22 = Utf8               name
  #23 = String             #24            // Name
  #24 = Utf8               Name
  #25 = Methodref          #10.#26        // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #26 = NameAndType        #27:#28        // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #27 = Utf8               getString
  #28 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #29 = Fieldref           #16.#30        // ext/mods/gameserver/model/Mission._name:Ljava/lang/String;
  #30 = NameAndType        #31:#32        // _name:Ljava/lang/String;
  #31 = Utf8               _name
  #32 = Utf8               Ljava/lang/String;
  #33 = String             #34            // icon
  #34 = Utf8               icon
  #35 = String             #36            // icon.noimage
  #36 = Utf8               icon.noimage
  #37 = Fieldref           #16.#38        // ext/mods/gameserver/model/Mission._icon:Ljava/lang/String;
  #38 = NameAndType        #39:#32        // _icon:Ljava/lang/String;
  #39 = Utf8               _icon
  #40 = String             #41            // desc
  #41 = Utf8               desc
  #42 = String             #43            // Description
  #43 = Utf8               Description
  #44 = Fieldref           #16.#45        // ext/mods/gameserver/model/Mission._description:Ljava/lang/String;
  #45 = NameAndType        #46:#32        // _description:Ljava/lang/String;
  #46 = Utf8               _description
  #47 = String             #48            // required
  #48 = Utf8               required
  #49 = Fieldref           #16.#50        // ext/mods/gameserver/model/Mission._required:I
  #50 = NameAndType        #51:#20        // _required:I
  #51 = Utf8               _required
  #52 = String             #53            // reward
  #53 = Utf8               reward
  #54 = Methodref          #10.#55        // ext/mods/commons/data/StatSet.getIntIntHolderList:(Ljava/lang/String;)Ljava/util/List;
  #55 = NameAndType        #56:#57        // getIntIntHolderList:(Ljava/lang/String;)Ljava/util/List;
  #56 = Utf8               getIntIntHolderList
  #57 = Utf8               (Ljava/lang/String;)Ljava/util/List;
  #58 = Fieldref           #16.#59        // ext/mods/gameserver/model/Mission._reward:Ljava/util/List;
  #59 = NameAndType        #60:#61        // _reward:Ljava/util/List;
  #60 = Utf8               _reward
  #61 = Utf8               Ljava/util/List;
  #62 = Utf8               Signature
  #63 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #64 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #65 = Utf8               Code
  #66 = Utf8               LineNumberTable
  #67 = Utf8               LocalVariableTable
  #68 = Utf8               this
  #69 = Utf8               Lext/mods/gameserver/model/Mission;
  #70 = Utf8               set
  #71 = Utf8               Lext/mods/commons/data/StatSet;
  #72 = Utf8               getLevel
  #73 = Utf8               ()I
  #74 = Utf8               getName
  #75 = Utf8               ()Ljava/lang/String;
  #76 = Utf8               getIcon
  #77 = Utf8               getDescription
  #78 = Utf8               getRequired
  #79 = Utf8               getRewards
  #80 = Utf8               ()Ljava/util/List;
  #81 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #82 = Utf8               SourceFile
  #83 = Utf8               Mission.java
{
  public ext.mods.gameserver.model.Mission(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: ldc           #7                  // String level
         8: iconst_1
         9: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        12: putfield      #15                 // Field _level:I
        15: aload_0
        16: aload_1
        17: ldc           #21                 // String name
        19: ldc           #23                 // String Name
        21: invokevirtual #25                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        24: putfield      #29                 // Field _name:Ljava/lang/String;
        27: aload_0
        28: aload_1
        29: ldc           #33                 // String icon
        31: ldc           #35                 // String icon.noimage
        33: invokevirtual #25                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        36: putfield      #37                 // Field _icon:Ljava/lang/String;
        39: aload_0
        40: aload_1
        41: ldc           #40                 // String desc
        43: ldc           #42                 // String Description
        45: invokevirtual #25                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        48: putfield      #44                 // Field _description:Ljava/lang/String;
        51: aload_0
        52: aload_1
        53: ldc           #47                 // String required
        55: iconst_1
        56: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        59: putfield      #49                 // Field _required:I
        62: aload_0
        63: aload_1
        64: ldc           #52                 // String reward
        66: invokevirtual #54                 // Method ext/mods/commons/data/StatSet.getIntIntHolderList:(Ljava/lang/String;)Ljava/util/List;
        69: putfield      #58                 // Field _reward:Ljava/util/List;
        72: return
      LineNumberTable:
        line 36: 0
        line 37: 4
        line 38: 15
        line 39: 27
        line 40: 39
        line 41: 51
        line 42: 62
        line 43: 72
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      73     0  this   Lext/mods/gameserver/model/Mission;
            0      73     1   set   Lext/mods/commons/data/StatSet;

  public final int getLevel();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _level:I
         4: ireturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Mission;

  public final java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Mission;

  public final java.lang.String getIcon();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field _icon:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Mission;

  public final java.lang.String getDescription();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #44                 // Field _description:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Mission;

  public final int getRequired();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #49                 // Field _required:I
         4: ireturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Mission;

  public final java.util.List<ext.mods.gameserver.model.holder.IntIntHolder> getRewards();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #58                 // Field _reward:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/Mission;
    Signature: #81                          // ()Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
}
SourceFile: "Mission.java"
