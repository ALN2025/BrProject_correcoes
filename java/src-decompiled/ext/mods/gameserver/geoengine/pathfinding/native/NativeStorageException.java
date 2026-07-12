// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.native.NativeStorageException
// File: ext\mods\gameserver\geoengine\pathfinding\native\NativeStorageException.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/native/NativeStorageException.class
  Last modified 9 de jul de 2026; size 1132 bytes
  MD5 checksum d355a0895266c86d77b0698fe03279f6
  Compiled from "NativeStorage.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.native.NativeStorageException extends java.lang.Exception
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorageException
  super_class: #4                         // java/lang/Exception
  interfaces: 0, fields: 0, methods: 2, attributes: 2
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/native/NativeStorageException
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorageException
   #3 = Utf8               java/lang/Exception
   #4 = Class              #3             // java/lang/Exception
   #5 = Utf8               <init>
   #6 = Utf8               (Ljava/lang/String;Ljava/lang/Throwable;)V
   #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #8 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #9 = NameAndType        #5:#6          // "<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
  #10 = Methodref          #4.#9          // java/lang/Exception."<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
  #11 = Utf8               this
  #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorageException;
  #13 = Utf8               message
  #14 = Utf8               Ljava/lang/String;
  #15 = Utf8               cause
  #16 = Utf8               Ljava/lang/Throwable;
  #17 = Utf8               (Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #18 = Methodref          #2.#9          // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorageException."<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
  #19 = Utf8               Lkotlin/Metadata;
  #20 = Utf8               mv
  #21 = Integer            2
  #22 = Integer            3
  #23 = Integer            0
  #24 = Utf8               k
  #25 = Integer            1
  #26 = Utf8               xi
  #27 = Integer            48
  #28 = Utf8               d1
  #29 = Utf8               \u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t
  #30 = Utf8               d2
  #31 = Utf8               Ljava/lang/Exception;
  #32 = Utf8               Lkotlin/Exception;
  #33 = Utf8
  #34 = Utf8               Brproject
  #35 = Utf8               NativeStorage.kt
  #36 = Utf8               Code
  #37 = Utf8               LineNumberTable
  #38 = Utf8               LocalVariableTable
  #39 = Utf8               RuntimeInvisibleParameterAnnotations
  #40 = Utf8               StackMapTable
  #41 = Utf8               SourceFile
  #42 = Utf8               RuntimeVisibleAnnotations
{
  public ext.mods.gameserver.geoengine.pathfinding.native.NativeStorageException(java.lang.String, java.lang.Throwable);
    descriptor: (Ljava/lang/String;Ljava/lang/Throwable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokespecial #10                 // Method java/lang/Exception."<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
         6: return
      LineNumberTable:
        line 258: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorageException;
            0       7     1 message   Ljava/lang/String;
            0       7     2 cause   Ljava/lang/Throwable;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #8()
          org.jetbrains.annotations.Nullable

  public ext.mods.gameserver.geoengine.pathfinding.native.NativeStorageException(java.lang.String, java.lang.Throwable, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=5, args_size=5
         0: iload_3
         1: iconst_2
         2: iand
         3: ifeq          8
         6: aconst_null
         7: astore_2
         8: aload_0
         9: aload_1
        10: aload_2
        11: invokespecial #18                 // Method "<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
        14: return
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */
      LineNumberTable:
        line 258: 0
}
SourceFile: "NativeStorage.kt"
RuntimeVisibleAnnotations:
  0: #19(#20=[I#21,I#22,I#23],#24=I#25,#26=I#27,#28=[s#29],#30=[s#12,s#31,s#32,s#13,s#33,s#15,s#33,s#5,s#6,s#34])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorageException;","Ljava/lang/Exception;","Lkotlin/Exception;","message","","cause","","<init>","(Ljava/lang/String;Ljava/lang/Throwable;)V","Brproject"]
    )
