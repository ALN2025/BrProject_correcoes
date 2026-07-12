// Bytecode for: ext.mods.gameserver.model.manor.SeedProduction
// File: ext\mods\gameserver\model\manor\SeedProduction.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/manor/SeedProduction.class
  Last modified 9 de jul de 2026; size 1368 bytes
  MD5 checksum 64530ebec197117b355114dbf3fba356
  Compiled from "SeedProduction.java"
public class ext.mods.gameserver.model.manor.SeedProduction
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/manor/SeedProduction
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 7, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/manor/SeedProduction._seedId:I
   #8 = Class              #10            // ext/mods/gameserver/model/manor/SeedProduction
   #9 = NameAndType        #11:#12        // _seedId:I
  #10 = Utf8               ext/mods/gameserver/model/manor/SeedProduction
  #11 = Utf8               _seedId
  #12 = Utf8               I
  #13 = Class              #14            // java/util/concurrent/atomic/AtomicInteger
  #14 = Utf8               java/util/concurrent/atomic/AtomicInteger
  #15 = Methodref          #13.#16        // java/util/concurrent/atomic/AtomicInteger."<init>":(I)V
  #16 = NameAndType        #5:#17         // "<init>":(I)V
  #17 = Utf8               (I)V
  #18 = Fieldref           #8.#19         // ext/mods/gameserver/model/manor/SeedProduction._amount:Ljava/util/concurrent/atomic/AtomicInteger;
  #19 = NameAndType        #20:#21        // _amount:Ljava/util/concurrent/atomic/AtomicInteger;
  #20 = Utf8               _amount
  #21 = Utf8               Ljava/util/concurrent/atomic/AtomicInteger;
  #22 = Fieldref           #8.#23         // ext/mods/gameserver/model/manor/SeedProduction._price:I
  #23 = NameAndType        #24:#12        // _price:I
  #24 = Utf8               _price
  #25 = Fieldref           #8.#26         // ext/mods/gameserver/model/manor/SeedProduction._startAmount:I
  #26 = NameAndType        #27:#12        // _startAmount:I
  #27 = Utf8               _startAmount
  #28 = Methodref          #13.#29        // java/util/concurrent/atomic/AtomicInteger.get:()I
  #29 = NameAndType        #30:#31        // get:()I
  #30 = Utf8               get
  #31 = Utf8               ()I
  #32 = Methodref          #13.#33        // java/util/concurrent/atomic/AtomicInteger.set:(I)V
  #33 = NameAndType        #34:#17        // set:(I)V
  #34 = Utf8               set
  #35 = Methodref          #13.#36        // java/util/concurrent/atomic/AtomicInteger.compareAndSet:(II)Z
  #36 = NameAndType        #37:#38        // compareAndSet:(II)Z
  #37 = Utf8               compareAndSet
  #38 = Utf8               (II)Z
  #39 = Utf8               (IIII)V
  #40 = Utf8               Code
  #41 = Utf8               LineNumberTable
  #42 = Utf8               LocalVariableTable
  #43 = Utf8               this
  #44 = Utf8               Lext/mods/gameserver/model/manor/SeedProduction;
  #45 = Utf8               id
  #46 = Utf8               amount
  #47 = Utf8               price
  #48 = Utf8               startAmount
  #49 = Utf8               getId
  #50 = Utf8               getAmount
  #51 = Utf8               getPrice
  #52 = Utf8               getStartAmount
  #53 = Utf8               setAmount
  #54 = Utf8               decreaseAmount
  #55 = Utf8               (I)Z
  #56 = Utf8               val
  #57 = Utf8               current
  #58 = Utf8               next
  #59 = Utf8               StackMapTable
  #60 = Utf8               SourceFile
  #61 = Utf8               SeedProduction.java
{
  public ext.mods.gameserver.model.manor.SeedProduction(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _seedId:I
         9: aload_0
        10: new           #13                 // class java/util/concurrent/atomic/AtomicInteger
        13: dup
        14: iload_2
        15: invokespecial #15                 // Method java/util/concurrent/atomic/AtomicInteger."<init>":(I)V
        18: putfield      #18                 // Field _amount:Ljava/util/concurrent/atomic/AtomicInteger;
        21: aload_0
        22: iload_3
        23: putfield      #22                 // Field _price:I
        26: aload_0
        27: iload         4
        29: putfield      #25                 // Field _startAmount:I
        32: return
      LineNumberTable:
        line 30: 0
        line 31: 4
        line 32: 9
        line 33: 21
        line 34: 26
        line 35: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/manor/SeedProduction;
            0      33     1    id   I
            0      33     2 amount   I
            0      33     3 price   I
            0      33     4 startAmount   I

  public final int getId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _seedId:I
         4: ireturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/manor/SeedProduction;

  public final int getAmount();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _amount:Ljava/util/concurrent/atomic/AtomicInteger;
         4: invokevirtual #28                 // Method java/util/concurrent/atomic/AtomicInteger.get:()I
         7: ireturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/manor/SeedProduction;

  public final int getPrice();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _price:I
         4: ireturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/manor/SeedProduction;

  public final int getStartAmount();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _startAmount:I
         4: ireturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/manor/SeedProduction;

  public final void setAmount(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #18                 // Field _amount:Ljava/util/concurrent/atomic/AtomicInteger;
         4: iload_1
         5: invokevirtual #32                 // Method java/util/concurrent/atomic/AtomicInteger.set:(I)V
         8: return
      LineNumberTable:
        line 59: 0
        line 60: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/manor/SeedProduction;
            0       9     1 amount   I

  public final boolean decreaseAmount(int);
    descriptor: (I)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: getfield      #18                 // Field _amount:Ljava/util/concurrent/atomic/AtomicInteger;
         4: invokevirtual #28                 // Method java/util/concurrent/atomic/AtomicInteger.get:()I
         7: istore_2
         8: iload_2
         9: iload_1
        10: isub
        11: istore_3
        12: iload_3
        13: ifge          18
        16: iconst_0
        17: ireturn
        18: aload_0
        19: getfield      #18                 // Field _amount:Ljava/util/concurrent/atomic/AtomicInteger;
        22: iload_2
        23: iload_3
        24: invokevirtual #35                 // Method java/util/concurrent/atomic/AtomicInteger.compareAndSet:(II)Z
        27: ifeq          0
        30: iconst_1
        31: ireturn
      LineNumberTable:
        line 69: 0
        line 70: 8
        line 72: 12
        line 73: 16
        line 75: 18
        line 77: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/manor/SeedProduction;
            0      32     1   val   I
            8      24     2 current   I
           12      20     3  next   I
      StackMapTable: number_of_entries = 2
        frame_type = 0 /* same */
        frame_type = 253 /* append */
          offset_delta = 17
          locals = [ int, int ]
}
SourceFile: "SeedProduction.java"
