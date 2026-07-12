// Bytecode for: ext.mods.battlerboss.holder.InfoHolder
// File: ext\mods\battlerboss\holder\InfoHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/battlerboss/holder/InfoHolder.class
  Last modified 9 de jul de 2026; size 1255 bytes
  MD5 checksum fc835ff8dc9ea82722509d92aa653079
  Compiled from "InfoHolder.java"
public class ext.mods.battlerboss.holder.InfoHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #18                         // ext/mods/battlerboss/holder/InfoHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 5, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = String             #8             // name
   #8 = Utf8               name
   #9 = String             #10            //
  #10 = Utf8
  #11 = Methodref          #12.#13        // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #12 = Class              #14            // ext/mods/commons/data/StatSet
  #13 = NameAndType        #15:#16        // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #14 = Utf8               ext/mods/commons/data/StatSet
  #15 = Utf8               getString
  #16 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #17 = Fieldref           #18.#19        // ext/mods/battlerboss/holder/InfoHolder.name:Ljava/lang/String;
  #18 = Class              #20            // ext/mods/battlerboss/holder/InfoHolder
  #19 = NameAndType        #8:#21         // name:Ljava/lang/String;
  #20 = Utf8               ext/mods/battlerboss/holder/InfoHolder
  #21 = Utf8               Ljava/lang/String;
  #22 = String             #23            // icon
  #23 = Utf8               icon
  #24 = Fieldref           #18.#25        // ext/mods/battlerboss/holder/InfoHolder.icon:Ljava/lang/String;
  #25 = NameAndType        #23:#21        // icon:Ljava/lang/String;
  #26 = String             #27            // desc
  #27 = Utf8               desc
  #28 = Methodref          #12.#29        // ext/mods/commons/data/StatSet.getList:(Ljava/lang/String;)Ljava/util/List;
  #29 = NameAndType        #30:#31        // getList:(Ljava/lang/String;)Ljava/util/List;
  #30 = Utf8               getList
  #31 = Utf8               (Ljava/lang/String;)Ljava/util/List;
  #32 = Fieldref           #18.#33        // ext/mods/battlerboss/holder/InfoHolder.desc:Ljava/util/List;
  #33 = NameAndType        #27:#34        // desc:Ljava/util/List;
  #34 = Utf8               Ljava/util/List;
  #35 = String             #36            // announce
  #36 = Utf8               announce
  #37 = Fieldref           #18.#38        // ext/mods/battlerboss/holder/InfoHolder.announce:Ljava/util/List;
  #38 = NameAndType        #36:#34        // announce:Ljava/util/List;
  #39 = Utf8               Signature
  #40 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #41 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #42 = Utf8               Code
  #43 = Utf8               LineNumberTable
  #44 = Utf8               LocalVariableTable
  #45 = Utf8               this
  #46 = Utf8               Lext/mods/battlerboss/holder/InfoHolder;
  #47 = Utf8               set
  #48 = Utf8               Lext/mods/commons/data/StatSet;
  #49 = Utf8               getName
  #50 = Utf8               ()Ljava/lang/String;
  #51 = Utf8               getDesc
  #52 = Utf8               ()Ljava/util/List;
  #53 = Utf8               ()Ljava/util/List<Ljava/lang/String;>;
  #54 = Utf8               getAnnounce
  #55 = Utf8               getIcon
  #56 = Utf8               SourceFile
  #57 = Utf8               InfoHolder.java
{
  public ext.mods.battlerboss.holder.InfoHolder(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: ldc           #7                  // String name
         8: ldc           #9                  // String
        10: invokevirtual #11                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        13: putfield      #17                 // Field name:Ljava/lang/String;
        16: aload_0
        17: aload_1
        18: ldc           #22                 // String icon
        20: ldc           #9                  // String
        22: invokevirtual #11                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        25: putfield      #24                 // Field icon:Ljava/lang/String;
        28: aload_0
        29: aload_1
        30: ldc           #26                 // String desc
        32: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.getList:(Ljava/lang/String;)Ljava/util/List;
        35: putfield      #32                 // Field desc:Ljava/util/List;
        38: aload_0
        39: aload_1
        40: ldc           #35                 // String announce
        42: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.getList:(Ljava/lang/String;)Ljava/util/List;
        45: putfield      #37                 // Field announce:Ljava/util/List;
        48: return
      LineNumberTable:
        line 32: 0
        line 33: 4
        line 34: 16
        line 35: 28
        line 36: 38
        line 37: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/battlerboss/holder/InfoHolder;
            0      49     1   set   Lext/mods/commons/data/StatSet;

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 41: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/InfoHolder;

  public java.util.List<java.lang.String> getDesc();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field desc:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 46: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/InfoHolder;
    Signature: #53                          // ()Ljava/util/List<Ljava/lang/String;>;

  public java.util.List<java.lang.String> getAnnounce();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field announce:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 51: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/InfoHolder;
    Signature: #53                          // ()Ljava/util/List<Ljava/lang/String;>;

  public java.lang.String getIcon();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field icon:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 56: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/battlerboss/holder/InfoHolder;
}
SourceFile: "InfoHolder.java"
