// Bytecode for: ext.mods.FarmEventRandom.holder.MessagesHolder
// File: ext\mods\FarmEventRandom\holder\MessagesHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/FarmEventRandom/holder/MessagesHolder.class
  Last modified 9 de jul de 2026; size 1931 bytes
  MD5 checksum db09008cb98e1ffb482591183537501c
  Compiled from "MessagesHolder.java"
public class ext.mods.FarmEventRandom.holder.MessagesHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/FarmEventRandom/holder/MessagesHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 11, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // java/util/ArrayList
   #8 = Utf8               java/util/ArrayList
   #9 = Methodref          #7.#3          // java/util/ArrayList."<init>":()V
  #10 = Fieldref           #11.#12        // ext/mods/FarmEventRandom/holder/MessagesHolder._onPrepare:Ljava/util/List;
  #11 = Class              #13            // ext/mods/FarmEventRandom/holder/MessagesHolder
  #12 = NameAndType        #14:#15        // _onPrepare:Ljava/util/List;
  #13 = Utf8               ext/mods/FarmEventRandom/holder/MessagesHolder
  #14 = Utf8               _onPrepare
  #15 = Utf8               Ljava/util/List;
  #16 = Fieldref           #11.#17        // ext/mods/FarmEventRandom/holder/MessagesHolder._onStart:Ljava/util/List;
  #17 = NameAndType        #18:#15        // _onStart:Ljava/util/List;
  #18 = Utf8               _onStart
  #19 = Fieldref           #11.#20        // ext/mods/FarmEventRandom/holder/MessagesHolder._onZone:Ljava/util/List;
  #20 = NameAndType        #21:#15        // _onZone:Ljava/util/List;
  #21 = Utf8               _onZone
  #22 = Fieldref           #11.#23        // ext/mods/FarmEventRandom/holder/MessagesHolder._onEnd:Ljava/util/List;
  #23 = NameAndType        #24:#15        // _onEnd:Ljava/util/List;
  #24 = Utf8               _onEnd
  #25 = Fieldref           #11.#26        // ext/mods/FarmEventRandom/holder/MessagesHolder._onAuto:Ljava/util/List;
  #26 = NameAndType        #27:#15        // _onAuto:Ljava/util/List;
  #27 = Utf8               _onAuto
  #28 = Methodref          #29.#30        // java/lang/String.isEmpty:()Z
  #29 = Class              #31            // java/lang/String
  #30 = NameAndType        #32:#33        // isEmpty:()Z
  #31 = Utf8               java/lang/String
  #32 = Utf8               isEmpty
  #33 = Utf8               ()Z
  #34 = InterfaceMethodref #35.#36        // java/util/List.add:(Ljava/lang/Object;)Z
  #35 = Class              #37            // java/util/List
  #36 = NameAndType        #38:#39        // add:(Ljava/lang/Object;)Z
  #37 = Utf8               java/util/List
  #38 = Utf8               add
  #39 = Utf8               (Ljava/lang/Object;)Z
  #40 = Utf8               Signature
  #41 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #42 = Utf8               Code
  #43 = Utf8               LineNumberTable
  #44 = Utf8               LocalVariableTable
  #45 = Utf8               this
  #46 = Utf8               Lext/mods/FarmEventRandom/holder/MessagesHolder;
  #47 = Utf8               addOnPrepare
  #48 = Utf8               (Ljava/lang/String;)V
  #49 = Utf8               msg
  #50 = Utf8               Ljava/lang/String;
  #51 = Utf8               StackMapTable
  #52 = Utf8               addOnStart
  #53 = Utf8               addOnZone
  #54 = Utf8               addOnEnd
  #55 = Utf8               addOnAuto
  #56 = Utf8               getOnPrepare
  #57 = Utf8               ()Ljava/util/List;
  #58 = Utf8               ()Ljava/util/List<Ljava/lang/String;>;
  #59 = Utf8               getOnStart
  #60 = Utf8               getOnZone
  #61 = Utf8               getOnEnd
  #62 = Utf8               getOnAuto
  #63 = Utf8               SourceFile
  #64 = Utf8               MessagesHolder.java
{
  public ext.mods.FarmEventRandom.holder.MessagesHolder();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        12: putfield      #10                 // Field _onPrepare:Ljava/util/List;
        15: aload_0
        16: new           #7                  // class java/util/ArrayList
        19: dup
        20: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        23: putfield      #16                 // Field _onStart:Ljava/util/List;
        26: aload_0
        27: new           #7                  // class java/util/ArrayList
        30: dup
        31: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        34: putfield      #19                 // Field _onZone:Ljava/util/List;
        37: aload_0
        38: new           #7                  // class java/util/ArrayList
        41: dup
        42: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        45: putfield      #22                 // Field _onEnd:Ljava/util/List;
        48: aload_0
        49: new           #7                  // class java/util/ArrayList
        52: dup
        53: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        56: putfield      #25                 // Field _onAuto:Ljava/util/List;
        59: return
      LineNumberTable:
        line 31: 0
        line 25: 4
        line 26: 15
        line 27: 26
        line 28: 37
        line 29: 48
        line 31: 59
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      60     0  this   Lext/mods/FarmEventRandom/holder/MessagesHolder;

  public void addOnPrepare(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        22
         4: aload_1
         5: invokevirtual #28                 // Method java/lang/String.isEmpty:()Z
         8: ifne          22
        11: aload_0
        12: getfield      #10                 // Field _onPrepare:Ljava/util/List;
        15: aload_1
        16: invokeinterface #34,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        21: pop
        22: return
      LineNumberTable:
        line 34: 0
        line 35: 11
        line 36: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/FarmEventRandom/holder/MessagesHolder;
            0      23     1   msg   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 22 /* same */

  public void addOnStart(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        22
         4: aload_1
         5: invokevirtual #28                 // Method java/lang/String.isEmpty:()Z
         8: ifne          22
        11: aload_0
        12: getfield      #16                 // Field _onStart:Ljava/util/List;
        15: aload_1
        16: invokeinterface #34,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        21: pop
        22: return
      LineNumberTable:
        line 39: 0
        line 40: 11
        line 41: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/FarmEventRandom/holder/MessagesHolder;
            0      23     1   msg   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 22 /* same */

  public void addOnZone(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        22
         4: aload_1
         5: invokevirtual #28                 // Method java/lang/String.isEmpty:()Z
         8: ifne          22
        11: aload_0
        12: getfield      #19                 // Field _onZone:Ljava/util/List;
        15: aload_1
        16: invokeinterface #34,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        21: pop
        22: return
      LineNumberTable:
        line 44: 0
        line 45: 11
        line 46: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/FarmEventRandom/holder/MessagesHolder;
            0      23     1   msg   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 22 /* same */

  public void addOnEnd(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        22
         4: aload_1
         5: invokevirtual #28                 // Method java/lang/String.isEmpty:()Z
         8: ifne          22
        11: aload_0
        12: getfield      #22                 // Field _onEnd:Ljava/util/List;
        15: aload_1
        16: invokeinterface #34,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        21: pop
        22: return
      LineNumberTable:
        line 49: 0
        line 50: 11
        line 51: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/FarmEventRandom/holder/MessagesHolder;
            0      23     1   msg   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 22 /* same */

  public void addOnAuto(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        22
         4: aload_1
         5: invokevirtual #28                 // Method java/lang/String.isEmpty:()Z
         8: ifne          22
        11: aload_0
        12: getfield      #25                 // Field _onAuto:Ljava/util/List;
        15: aload_1
        16: invokeinterface #34,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        21: pop
        22: return
      LineNumberTable:
        line 54: 0
        line 55: 11
        line 56: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/FarmEventRandom/holder/MessagesHolder;
            0      23     1   msg   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 22 /* same */

  public java.util.List<java.lang.String> getOnPrepare();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _onPrepare:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 58: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/FarmEventRandom/holder/MessagesHolder;
    Signature: #58                          // ()Ljava/util/List<Ljava/lang/String;>;

  public java.util.List<java.lang.String> getOnStart();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _onStart:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 59: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/FarmEventRandom/holder/MessagesHolder;
    Signature: #58                          // ()Ljava/util/List<Ljava/lang/String;>;

  public java.util.List<java.lang.String> getOnZone();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _onZone:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 60: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/FarmEventRandom/holder/MessagesHolder;
    Signature: #58                          // ()Ljava/util/List<Ljava/lang/String;>;

  public java.util.List<java.lang.String> getOnEnd();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _onEnd:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 61: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/FarmEventRandom/holder/MessagesHolder;
    Signature: #58                          // ()Ljava/util/List<Ljava/lang/String;>;

  public java.util.List<java.lang.String> getOnAuto();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _onAuto:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/FarmEventRandom/holder/MessagesHolder;
    Signature: #58                          // ()Ljava/util/List<Ljava/lang/String;>;
}
SourceFile: "MessagesHolder.java"
