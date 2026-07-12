// Bytecode for: ext.mods.gameserver.network.SessionKey
// File: ext\mods\gameserver\network\SessionKey.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/SessionKey.class
  Last modified 9 de jul de 2026; size 1137 bytes
  MD5 checksum 74b118df6449b8aa5118e798a0d9be2e
  Compiled from "SessionKey.java"
public class ext.mods.gameserver.network.SessionKey
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/SessionKey
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/network/SessionKey.playOkID1:I
   #8 = Class              #10            // ext/mods/gameserver/network/SessionKey
   #9 = NameAndType        #11:#12        // playOkID1:I
  #10 = Utf8               ext/mods/gameserver/network/SessionKey
  #11 = Utf8               playOkID1
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/network/SessionKey.playOkID2:I
  #14 = NameAndType        #15:#12        // playOkID2:I
  #15 = Utf8               playOkID2
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/network/SessionKey.loginOkID1:I
  #17 = NameAndType        #18:#12        // loginOkID1:I
  #18 = Utf8               loginOkID1
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/network/SessionKey.loginOkID2:I
  #20 = NameAndType        #21:#12        // loginOkID2:I
  #21 = Utf8               loginOkID2
  #22 = InvokeDynamic      #0:#23         // #0:makeConcatWithConstants:(IIII)Ljava/lang/String;
  #23 = NameAndType        #24:#25        // makeConcatWithConstants:(IIII)Ljava/lang/String;
  #24 = Utf8               makeConcatWithConstants
  #25 = Utf8               (IIII)Ljava/lang/String;
  #26 = Utf8               (IIII)V
  #27 = Utf8               Code
  #28 = Utf8               LineNumberTable
  #29 = Utf8               LocalVariableTable
  #30 = Utf8               this
  #31 = Utf8               Lext/mods/gameserver/network/SessionKey;
  #32 = Utf8               loginOK1
  #33 = Utf8               loginOK2
  #34 = Utf8               playOK1
  #35 = Utf8               playOK2
  #36 = Utf8               toString
  #37 = Utf8               ()Ljava/lang/String;
  #38 = Utf8               SourceFile
  #39 = Utf8               SessionKey.java
  #40 = Utf8               BootstrapMethods
  #41 = String             #42            // PlayOk: \u0001 \u0001 LoginOk:\u0001 \u0001
  #42 = Utf8               PlayOk: \u0001 \u0001 LoginOk:\u0001 \u0001
  #43 = MethodHandle       6:#44          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #44 = Methodref          #45.#46        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #45 = Class              #47            // java/lang/invoke/StringConcatFactory
  #46 = NameAndType        #24:#48        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #47 = Utf8               java/lang/invoke/StringConcatFactory
  #48 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #49 = Utf8               InnerClasses
  #50 = Class              #51            // java/lang/invoke/MethodHandles$Lookup
  #51 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #52 = Class              #53            // java/lang/invoke/MethodHandles
  #53 = Utf8               java/lang/invoke/MethodHandles
  #54 = Utf8               Lookup
{
  public int playOkID1;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int playOkID2;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int loginOkID1;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public int loginOkID2;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.gameserver.network.SessionKey(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_3
         6: putfield      #7                  // Field playOkID1:I
         9: aload_0
        10: iload         4
        12: putfield      #13                 // Field playOkID2:I
        15: aload_0
        16: iload_1
        17: putfield      #16                 // Field loginOkID1:I
        20: aload_0
        21: iload_2
        22: putfield      #19                 // Field loginOkID2:I
        25: return
      LineNumberTable:
        line 28: 0
        line 29: 4
        line 30: 9
        line 31: 15
        line 32: 20
        line 33: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/network/SessionKey;
            0      26     1 loginOK1   I
            0      26     2 loginOK2   I
            0      26     3 playOK1   I
            0      26     4 playOK2   I

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field playOkID1:I
         4: aload_0
         5: getfield      #13                 // Field playOkID2:I
         8: aload_0
         9: getfield      #16                 // Field loginOkID1:I
        12: aload_0
        13: getfield      #19                 // Field loginOkID2:I
        16: invokedynamic #22,  0             // InvokeDynamic #0:makeConcatWithConstants:(IIII)Ljava/lang/String;
        21: areturn
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/network/SessionKey;
}
SourceFile: "SessionKey.java"
BootstrapMethods:
  0: #43 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #41 PlayOk: \u0001 \u0001 LoginOk:\u0001 \u0001
InnerClasses:
  public static final #54= #50 of #52;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
