// Bytecode for: ext.mods.gameserver.LoginServerThread$Companion
// File: ext\mods\gameserver\LoginServerThread$Companion.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/LoginServerThread$Companion.class
  Last modified 9 de jul de 2026; size 1710 bytes
  MD5 checksum d20d66d9d6ab0551c714e02c57e6920c
  Compiled from "LoginServerThread.kt"
public final class ext.mods.gameserver.LoginServerThread$Companion
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/LoginServerThread$Companion
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 4, attributes: 3
Constant pool:
   #1 = Utf8               ext/mods/gameserver/LoginServerThread$Companion
   #2 = Class              #1             // ext/mods/gameserver/LoginServerThread$Companion
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = NameAndType        #5:#6          // "<init>":()V
   #8 = Methodref          #4.#7          // java/lang/Object."<init>":()V
   #9 = Utf8               this
  #10 = Utf8               Lext/mods/gameserver/LoginServerThread$Companion;
  #11 = Utf8               getInstance
  #12 = Utf8               ()Lext/mods/gameserver/LoginServerThread;
  #13 = Utf8               Lkotlin/jvm/JvmStatic;
  #14 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #15 = Utf8               ext/mods/gameserver/LoginServerThread
  #16 = Class              #15            // ext/mods/gameserver/LoginServerThread
  #17 = Utf8               access$getInstanceHolder$cp
  #18 = Utf8               ()Lkotlin/Lazy;
  #19 = NameAndType        #17:#18        // access$getInstanceHolder$cp:()Lkotlin/Lazy;
  #20 = Methodref          #16.#19        // ext/mods/gameserver/LoginServerThread.access$getInstanceHolder$cp:()Lkotlin/Lazy;
  #21 = Utf8               kotlin/Lazy
  #22 = Class              #21            // kotlin/Lazy
  #23 = Utf8               getValue
  #24 = Utf8               ()Ljava/lang/Object;
  #25 = NameAndType        #23:#24        // getValue:()Ljava/lang/Object;
  #26 = InterfaceMethodref #22.#25        // kotlin/Lazy.getValue:()Ljava/lang/Object;
  #27 = Utf8               generateHex
  #28 = Utf8               (I)[B
  #29 = Utf8               ext/mods/commons/random/Rnd
  #30 = Class              #29            // ext/mods/commons/random/Rnd
  #31 = Utf8               nextBytes
  #32 = Utf8               ([B)[B
  #33 = NameAndType        #31:#32        // nextBytes:([B)[B
  #34 = Methodref          #30.#33        // ext/mods/commons/random/Rnd.nextBytes:([B)[B
  #35 = Utf8               array
  #36 = Utf8               [B
  #37 = Utf8               size
  #38 = Utf8               I
  #39 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #40 = Methodref          #2.#7          // ext/mods/gameserver/LoginServerThread$Companion."<init>":()V
  #41 = Utf8               $constructor_marker
  #42 = Utf8               Lkotlin/jvm/internal/DefaultConstructorMarker;
  #43 = Utf8               Lkotlin/Metadata;
  #44 = Utf8               mv
  #45 = Integer            2
  #46 = Integer            3
  #47 = Integer            0
  #48 = Utf8               k
  #49 = Integer            1
  #50 = Utf8               xi
  #51 = Integer            48
  #52 = Utf8               d1
  #53 = Utf8               \u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f
  #54 = Utf8               d2
  #55 = Utf8
  #56 = Utf8               REVISION
  #57 = Utf8               LOGGER
  #58 = Utf8               Lext/mods/commons/logging/CLogger;
  #59 = Utf8               instanceHolder
  #60 = Utf8               Lkotlin/Lazy;
  #61 = Utf8               Lext/mods/gameserver/LoginServerThread;
  #62 = Utf8               Brproject
  #63 = Utf8               Companion
  #64 = Utf8               LoginServerThread.kt
  #65 = Utf8               Code
  #66 = Utf8               LineNumberTable
  #67 = Utf8               LocalVariableTable
  #68 = Utf8               RuntimeVisibleAnnotations
  #69 = Utf8               RuntimeInvisibleAnnotations
  #70 = Utf8               InnerClasses
  #71 = Utf8               SourceFile
{
  public final ext.mods.gameserver.LoginServerThread getInstance();
    descriptor: ()Lext/mods/gameserver/LoginServerThread;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #20                 // Method ext/mods/gameserver/LoginServerThread.access$getInstanceHolder$cp:()Lkotlin/Lazy;
         3: invokeinterface #26,  1           // InterfaceMethod kotlin/Lazy.getValue:()Ljava/lang/Object;
         8: checkcast     #16                 // class ext/mods/gameserver/LoginServerThread
        11: areturn
      LineNumberTable:
        line 310: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/LoginServerThread$Companion;
    RuntimeVisibleAnnotations:
      0: #13()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleAnnotations:
      0: #14()
        org.jetbrains.annotations.NotNull

  public final byte[] generateHex(int);
    descriptor: (I)[B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=3, args_size=2
         0: iload_1
         1: newarray       byte
         3: astore_2
         4: aload_2
         5: invokestatic  #34                 // Method ext/mods/commons/random/Rnd.nextBytes:([B)[B
         8: pop
         9: aload_2
        10: areturn
      LineNumberTable:
        line 313: 0
        line 314: 4
        line 315: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            4       7     2 array   [B
            0      11     0  this   Lext/mods/gameserver/LoginServerThread$Companion;
            0      11     1  size   I
    RuntimeVisibleAnnotations:
      0: #13()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleAnnotations:
      0: #14()
        org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.LoginServerThread$Companion(kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_0
         1: invokespecial #40                 // Method "<init>":()V
         4: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/LoginServerThread$Companion;
            0       5     1 $constructor_marker   Lkotlin/jvm/internal/DefaultConstructorMarker;
}
InnerClasses:
  public static final #63= #2 of #16;     // Companion=class ext/mods/gameserver/LoginServerThread$Companion of class ext/mods/gameserver/LoginServerThread
SourceFile: "LoginServerThread.kt"
RuntimeVisibleAnnotations:
  0: #43(#44=[I#45,I#46,I#47],#48=I#49,#50=I#51,#52=[s#53],#54=[s#10,s#55,s#5,s#6,s#56,s#55,s#57,s#58,s#59,s#60,s#61,s#11,s#27,s#55,s#37,s#62])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"]
      d2=["Lext/mods/gameserver/LoginServerThread$Companion;","","<init>","()V","REVISION","","LOGGER","Lext/mods/commons/logging/CLogger;","instanceHolder","Lkotlin/Lazy;","Lext/mods/gameserver/LoginServerThread;","getInstance","generateHex","","size","Brproject"]
    )
