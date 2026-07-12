// Bytecode for: ext.mods.commons.pool.RunnableWrapper
// File: ext\mods\commons\pool\RunnableWrapper.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/pool/RunnableWrapper.class
  Last modified 9 de jul de 2026; size 1501 bytes
  MD5 checksum c803fcefa13806286e1ad2adafe792a3
  Compiled from "RunnableWrapper.kt"
public final class ext.mods.commons.pool.RunnableWrapper implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/commons/pool/RunnableWrapper
  super_class: #4                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 2, attributes: 3
Constant pool:
   #1 = Utf8               ext/mods/commons/pool/RunnableWrapper
   #2 = Class              #1             // ext/mods/commons/pool/RunnableWrapper
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               java/lang/Runnable
   #6 = Class              #5             // java/lang/Runnable
   #7 = Utf8               <init>
   #8 = Utf8               (Ljava/lang/Runnable;)V
   #9 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #10 = Utf8               ()V
  #11 = NameAndType        #7:#10         // "<init>":()V
  #12 = Methodref          #4.#11         // java/lang/Object."<init>":()V
  #13 = Utf8               runnable
  #14 = Utf8               Ljava/lang/Runnable;
  #15 = NameAndType        #13:#14        // runnable:Ljava/lang/Runnable;
  #16 = Fieldref           #2.#15         // ext/mods/commons/pool/RunnableWrapper.runnable:Ljava/lang/Runnable;
  #17 = Utf8               this
  #18 = Utf8               Lext/mods/commons/pool/RunnableWrapper;
  #19 = Utf8               run
  #20 = Utf8               java/lang/Throwable
  #21 = Class              #20            // java/lang/Throwable
  #22 = NameAndType        #19:#10        // run:()V
  #23 = InterfaceMethodref #6.#22         // java/lang/Runnable.run:()V
  #24 = Utf8               java/lang/Thread
  #25 = Class              #24            // java/lang/Thread
  #26 = Utf8               currentThread
  #27 = Utf8               ()Ljava/lang/Thread;
  #28 = NameAndType        #26:#27        // currentThread:()Ljava/lang/Thread;
  #29 = Methodref          #25.#28        // java/lang/Thread.currentThread:()Ljava/lang/Thread;
  #30 = Utf8               getUncaughtExceptionHandler
  #31 = Utf8               ()Ljava/lang/Thread$UncaughtExceptionHandler;
  #32 = NameAndType        #30:#31        // getUncaughtExceptionHandler:()Ljava/lang/Thread$UncaughtExceptionHandler;
  #33 = Methodref          #25.#32        // java/lang/Thread.getUncaughtExceptionHandler:()Ljava/lang/Thread$UncaughtExceptionHandler;
  #34 = Utf8               java/lang/Thread$UncaughtExceptionHandler
  #35 = Class              #34            // java/lang/Thread$UncaughtExceptionHandler
  #36 = Utf8               uncaughtException
  #37 = Utf8               (Ljava/lang/Thread;Ljava/lang/Throwable;)V
  #38 = NameAndType        #36:#37        // uncaughtException:(Ljava/lang/Thread;Ljava/lang/Throwable;)V
  #39 = InterfaceMethodref #35.#38        // java/lang/Thread$UncaughtExceptionHandler.uncaughtException:(Ljava/lang/Thread;Ljava/lang/Throwable;)V
  #40 = Utf8               t
  #41 = Utf8               Ljava/lang/Thread;
  #42 = Utf8               h
  #43 = Utf8               Ljava/lang/Thread$UncaughtExceptionHandler;
  #44 = Utf8               e
  #45 = Utf8               Ljava/lang/Throwable;
  #46 = Utf8               Lkotlin/Metadata;
  #47 = Utf8               mv
  #48 = Integer            2
  #49 = Integer            3
  #50 = Integer            0
  #51 = Utf8               k
  #52 = Integer            1
  #53 = Utf8               xi
  #54 = Integer            48
  #55 = Utf8               d1
  #56 = Utf8               \u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007
  #57 = Utf8               d2
  #58 = Utf8
  #59 = Utf8               Brproject
  #60 = Utf8               UncaughtExceptionHandler
  #61 = Utf8               RunnableWrapper.kt
  #62 = Utf8               RuntimeInvisibleAnnotations
  #63 = Utf8               Code
  #64 = Utf8               LineNumberTable
  #65 = Utf8               LocalVariableTable
  #66 = Utf8               RuntimeInvisibleParameterAnnotations
  #67 = Utf8               StackMapTable
  #68 = Utf8               InnerClasses
  #69 = Utf8               SourceFile
  #70 = Utf8               RuntimeVisibleAnnotations
{
  public ext.mods.commons.pool.RunnableWrapper(java.lang.Runnable);
    descriptor: (Ljava/lang/Runnable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #12                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #16                 // Field runnable:Ljava/lang/Runnable;
         9: return
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/pool/RunnableWrapper;
            0      10     1 runnable   Ljava/lang/Runnable;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=1
         0: nop
         1: aload_0
         2: getfield      #16                 // Field runnable:Ljava/lang/Runnable;
         5: invokeinterface #23,  1           // InterfaceMethod java/lang/Runnable.run:()V
        10: goto          35
        13: astore_1
        14: invokestatic  #29                 // Method java/lang/Thread.currentThread:()Ljava/lang/Thread;
        17: astore_2
        18: aload_2
        19: invokevirtual #33                 // Method java/lang/Thread.getUncaughtExceptionHandler:()Ljava/lang/Thread$UncaughtExceptionHandler;
        22: astore_3
        23: aload_3
        24: ifnull        35
        27: aload_3
        28: aload_2
        29: aload_1
        30: invokeinterface #39,  3           // InterfaceMethod java/lang/Thread$UncaughtExceptionHandler.uncaughtException:(Ljava/lang/Thread;Ljava/lang/Throwable;)V
        35: return
      Exception table:
         from    to  target type
             0    10    13   Class java/lang/Throwable
      StackMapTable: number_of_entries = 2
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 21 /* same */
      LineNumberTable:
        line 28: 0
        line 29: 1
        line 30: 13
        line 31: 14
        line 32: 18
        line 34: 23
        line 35: 27
        line 38: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18      17     2     t   Ljava/lang/Thread;
           23      12     3     h   Ljava/lang/Thread$UncaughtExceptionHandler;
           14      21     1     e   Ljava/lang/Throwable;
            0      36     0  this   Lext/mods/commons/pool/RunnableWrapper;
}
InnerClasses:
  public static #60= #35 of #25;          // UncaughtExceptionHandler=class java/lang/Thread$UncaughtExceptionHandler of class java/lang/Thread
SourceFile: "RunnableWrapper.kt"
RuntimeVisibleAnnotations:
  0: #46(#47=[I#48,I#49,I#50],#51=I#52,#53=I#54,#55=[s#56],#57=[s#18,s#14,s#13,s#7,s#8,s#19,s#58,s#59])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"]
      d2=["Lext/mods/commons/pool/RunnableWrapper;","Ljava/lang/Runnable;","runnable","<init>","(Ljava/lang/Runnable;)V","run","","Brproject"]
    )
