// Bytecode for: ext.mods.email.EmailProtectionItems
// File: ext\mods\email\EmailProtectionItems.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/email/EmailProtectionItems.class
  Last modified 9 de jul de 2026; size 650 bytes
  MD5 checksum c1884cb1b567ec10577b5a07ad956f3c
  Compiled from "EmailProtectionItems.java"
public class ext.mods.email.EmailProtectionItems
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #20                         // ext/mods/email/EmailProtectionItems
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // java/lang/Integer
   #8 = Utf8               java/lang/Integer
   #9 = Methodref          #7.#10         // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #10 = NameAndType        #11:#12        // valueOf:(I)Ljava/lang/Integer;
  #11 = Utf8               valueOf
  #12 = Utf8               (I)Ljava/lang/Integer;
  #13 = Methodref          #14.#15        // java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
  #14 = Class              #16            // java/util/Arrays
  #15 = NameAndType        #17:#18        // asList:([Ljava/lang/Object;)Ljava/util/List;
  #16 = Utf8               java/util/Arrays
  #17 = Utf8               asList
  #18 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
  #19 = Fieldref           #20.#21        // ext/mods/email/EmailProtectionItems.PROIBIDOS:Ljava/util/List;
  #20 = Class              #22            // ext/mods/email/EmailProtectionItems
  #21 = NameAndType        #23:#24        // PROIBIDOS:Ljava/util/List;
  #22 = Utf8               ext/mods/email/EmailProtectionItems
  #23 = Utf8               PROIBIDOS
  #24 = Utf8               Ljava/util/List;
  #25 = Utf8               Signature
  #26 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #27 = Utf8               Code
  #28 = Utf8               LineNumberTable
  #29 = Utf8               LocalVariableTable
  #30 = Utf8               this
  #31 = Utf8               Lext/mods/email/EmailProtectionItems;
  #32 = Utf8               <clinit>
  #33 = Utf8               SourceFile
  #34 = Utf8               EmailProtectionItems.java
{
  public static final java.util.List<java.lang.Integer> PROIBIDOS;
    descriptor: Ljava/util/List;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Signature: #26                          // Ljava/util/List<Ljava/lang/Integer;>;

  public ext.mods.email.EmailProtectionItems();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/email/EmailProtectionItems;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #7                  // class java/lang/Integer
         4: dup
         5: iconst_0
         6: bipush        57
         8: invokestatic  #9                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: aastore
        12: dup
        13: iconst_1
        14: sipush        3470
        17: invokestatic  #9                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        20: aastore
        21: invokestatic  #13                 // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        24: putstatic     #19                 // Field PROIBIDOS:Ljava/util/List;
        27: return
      LineNumberTable:
        line 25: 0
}
SourceFile: "EmailProtectionItems.java"
