// Bytecode for: ext.mods.gameserver.model.memo.MakerMemo
// File: ext\mods\gameserver\model\memo\MakerMemo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/memo/MakerMemo.class
  Last modified 9 de jul de 2026; size 1164 bytes
  MD5 checksum 82ae526d40589e32231df325b84247c6
  Compiled from "MakerMemo.java"
public class ext.mods.gameserver.model.memo.MakerMemo extends ext.mods.commons.data.MemoSet
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #13                         // ext/mods/gameserver/model/memo/MakerMemo
  super_class: #2                         // ext/mods/commons/data/MemoSet
  interfaces: 0, fields: 2, methods: 6, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/commons/data/MemoSet."<init>":()V
   #2 = Class              #4             // ext/mods/commons/data/MemoSet
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/commons/data/MemoSet
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #2.#8          // ext/mods/commons/data/MemoSet."<init>":(I)V
   #8 = NameAndType        #5:#9          // "<init>":(I)V
   #9 = Utf8               (I)V
  #10 = Methodref          #2.#11         // ext/mods/commons/data/MemoSet."<init>":(Ljava/util/Map;)V
  #11 = NameAndType        #5:#12         // "<init>":(Ljava/util/Map;)V
  #12 = Utf8               (Ljava/util/Map;)V
  #13 = Class              #14            // ext/mods/gameserver/model/memo/MakerMemo
  #14 = Utf8               ext/mods/gameserver/model/memo/MakerMemo
  #15 = Methodref          #13.#3         // ext/mods/gameserver/model/memo/MakerMemo."<init>":()V
  #16 = Fieldref           #13.#17        // ext/mods/gameserver/model/memo/MakerMemo.DUMMY_SET:Lext/mods/gameserver/model/memo/MakerMemo;
  #17 = NameAndType        #18:#19        // DUMMY_SET:Lext/mods/gameserver/model/memo/MakerMemo;
  #18 = Utf8               DUMMY_SET
  #19 = Utf8               Lext/mods/gameserver/model/memo/MakerMemo;
  #20 = Utf8               serialVersionUID
  #21 = Utf8               J
  #22 = Utf8               ConstantValue
  #23 = Long               1l
  #25 = Utf8               Code
  #26 = Utf8               LineNumberTable
  #27 = Utf8               LocalVariableTable
  #28 = Utf8               this
  #29 = Utf8               size
  #30 = Utf8               I
  #31 = Utf8               m
  #32 = Utf8               Ljava/util/Map;
  #33 = Utf8               LocalVariableTypeTable
  #34 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
  #35 = Utf8               Signature
  #36 = Utf8               (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V
  #37 = Utf8               onSet
  #38 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #39 = Utf8               key
  #40 = Utf8               Ljava/lang/String;
  #41 = Utf8               value
  #42 = Utf8               onUnset
  #43 = Utf8               (Ljava/lang/String;)V
  #44 = Utf8               <clinit>
  #45 = Utf8               SourceFile
  #46 = Utf8               MakerMemo.java
{
  public static final ext.mods.gameserver.model.memo.MakerMemo DUMMY_SET;
    descriptor: Lext/mods/gameserver/model/memo/MakerMemo;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public ext.mods.gameserver.model.memo.MakerMemo();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/commons/data/MemoSet."<init>":()V
         4: return
      LineNumberTable:
        line 35: 0
        line 36: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/memo/MakerMemo;

  public ext.mods.gameserver.model.memo.MakerMemo(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #7                  // Method ext/mods/commons/data/MemoSet."<init>":(I)V
         5: return
      LineNumberTable:
        line 40: 0
        line 41: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/memo/MakerMemo;
            0       6     1  size   I

  public ext.mods.gameserver.model.memo.MakerMemo(java.util.Map<java.lang.String, java.lang.String>);
    descriptor: (Ljava/util/Map;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #10                 // Method ext/mods/commons/data/MemoSet."<init>":(Ljava/util/Map;)V
         5: return
      LineNumberTable:
        line 45: 0
        line 46: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/memo/MakerMemo;
            0       6     1     m   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     1     m   Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
    Signature: #36                          // (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V

  protected void onSet(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=3, args_size=3
         0: return
      LineNumberTable:
        line 51: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/memo/MakerMemo;
            0       1     1   key   Ljava/lang/String;
            0       1     2 value   Ljava/lang/String;

  protected void onUnset(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 56: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/memo/MakerMemo;
            0       1     1   key   Ljava/lang/String;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #13                 // class ext/mods/gameserver/model/memo/MakerMemo
         3: dup
         4: invokespecial #15                 // Method "<init>":()V
         7: putstatic     #16                 // Field DUMMY_SET:Lext/mods/gameserver/model/memo/MakerMemo;
        10: return
      LineNumberTable:
        line 31: 0
}
SourceFile: "MakerMemo.java"
