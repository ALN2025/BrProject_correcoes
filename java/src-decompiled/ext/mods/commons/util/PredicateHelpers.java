// Bytecode for: ext.mods.commons.util.PredicateHelpers
// File: ext\mods\commons\util\PredicateHelpers.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/util/PredicateHelpers.class
  Last modified 9 de jul de 2026; size 2844 bytes
  MD5 checksum 2c24c853bd139a6f5c99df4eecfc5db8
  Compiled from "PredicateHelpers.java"
public class ext.mods.commons.util.PredicateHelpers
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #59                         // ext/mods/commons/util/PredicateHelpers
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/ConcurrentHashMap
    #8 = Utf8               java/util/concurrent/ConcurrentHashMap
    #9 = Methodref          #7.#3         // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #10 = InvokeDynamic      #0:#11        // #0:test:([Ljava/util/function/Function;Ljava/util/Map;)Ljava/util/function/Predicate;
   #11 = NameAndType        #12:#13       // test:([Ljava/util/function/Function;Ljava/util/Map;)Ljava/util/function/Predicate;
   #12 = Utf8               test
   #13 = Utf8               ([Ljava/util/function/Function;Ljava/util/Map;)Ljava/util/function/Predicate;
   #14 = Methodref          #15.#16       // java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
   #15 = Class              #17           // java/util/Arrays
   #16 = NameAndType        #18:#19       // stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
   #17 = Utf8               java/util/Arrays
   #18 = Utf8               stream
   #19 = Utf8               ([Ljava/lang/Object;)Ljava/util/stream/Stream;
   #20 = InvokeDynamic      #1:#21        // #1:apply:(Ljava/lang/Object;)Ljava/util/function/Function;
   #21 = NameAndType        #22:#23       // apply:(Ljava/lang/Object;)Ljava/util/function/Function;
   #22 = Utf8               apply
   #23 = Utf8               (Ljava/lang/Object;)Ljava/util/function/Function;
   #24 = InterfaceMethodref #25.#26       // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #25 = Class              #27           // java/util/stream/Stream
   #26 = NameAndType        #28:#29       // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #27 = Utf8               java/util/stream/Stream
   #28 = Utf8               map
   #29 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #30 = Methodref          #31.#32       // java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
   #31 = Class              #33           // java/util/stream/Collectors
   #32 = NameAndType        #34:#35       // toList:()Ljava/util/stream/Collector;
   #33 = Utf8               java/util/stream/Collectors
   #34 = Utf8               toList
   #35 = Utf8               ()Ljava/util/stream/Collector;
   #36 = InterfaceMethodref #25.#37       // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #37 = NameAndType        #38:#39       // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #38 = Utf8               collect
   #39 = Utf8               (Ljava/util/stream/Collector;)Ljava/lang/Object;
   #40 = Class              #41           // java/util/List
   #41 = Utf8               java/util/List
   #42 = Fieldref           #43.#44       // java/lang/Boolean.TRUE:Ljava/lang/Boolean;
   #43 = Class              #45           // java/lang/Boolean
   #44 = NameAndType        #46:#47       // TRUE:Ljava/lang/Boolean;
   #45 = Utf8               java/lang/Boolean
   #46 = Utf8               TRUE
   #47 = Utf8               Ljava/lang/Boolean;
   #48 = InterfaceMethodref #49.#50       // java/util/Map.putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #49 = Class              #51           // java/util/Map
   #50 = NameAndType        #52:#53       // putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #51 = Utf8               java/util/Map
   #52 = Utf8               putIfAbsent
   #53 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #54 = InterfaceMethodref #55.#56       // java/util/function/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
   #55 = Class              #57           // java/util/function/Function
   #56 = NameAndType        #22:#58       // apply:(Ljava/lang/Object;)Ljava/lang/Object;
   #57 = Utf8               java/util/function/Function
   #58 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #59 = Class              #60           // ext/mods/commons/util/PredicateHelpers
   #60 = Utf8               ext/mods/commons/util/PredicateHelpers
   #61 = Utf8               Code
   #62 = Utf8               LineNumberTable
   #63 = Utf8               LocalVariableTable
   #64 = Utf8               this
   #65 = Utf8               Lext/mods/commons/util/PredicateHelpers;
   #66 = Utf8               distinctByKeys
   #67 = Utf8               ([Ljava/util/function/Function;)Ljava/util/function/Predicate;
   #68 = Utf8               keyExtractors
   #69 = Utf8               [Ljava/util/function/Function;
   #70 = Utf8               seen
   #71 = Utf8               Ljava/util/Map;
   #72 = Utf8               LocalVariableTypeTable
   #73 = Utf8               [Ljava/util/function/Function<-TT;*>;
   #74 = Utf8               Ljava/util/Map<Ljava/util/List<*>;Ljava/lang/Boolean;>;
   #75 = Utf8               Signature
   #76 = Utf8               <T:Ljava/lang/Object;>([Ljava/util/function/Function<-TT;*>;)Ljava/util/function/Predicate<TT;>;
   #77 = Utf8               RuntimeVisibleAnnotations
   #78 = Utf8               Ljava/lang/SafeVarargs;
   #79 = Utf8               lambda$distinctByKeys$0
   #80 = Utf8               ([Ljava/util/function/Function;Ljava/util/Map;Ljava/lang/Object;)Z
   #81 = Utf8               t
   #82 = Utf8               Ljava/lang/Object;
   #83 = Utf8               keys
   #84 = Utf8               Ljava/util/List;
   #85 = Utf8               Ljava/util/List<*>;
   #86 = Utf8               StackMapTable
   #87 = Utf8               lambda$distinctByKeys$1
   #88 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #89 = Utf8               ke
   #90 = Utf8               Ljava/util/function/Function;
   #91 = Utf8               SourceFile
   #92 = Utf8               PredicateHelpers.java
   #93 = Utf8               BootstrapMethods
   #94 = MethodType         #95           //  (Ljava/lang/Object;)Z
   #95 = Utf8               (Ljava/lang/Object;)Z
   #96 = MethodHandle       6:#97         // REF_invokeStatic ext/mods/commons/util/PredicateHelpers.lambda$distinctByKeys$0:([Ljava/util/function/Function;Ljava/util/Map;Ljava/lang/Object;)Z
   #97 = Methodref          #59.#98       // ext/mods/commons/util/PredicateHelpers.lambda$distinctByKeys$0:([Ljava/util/function/Function;Ljava/util/Map;Ljava/lang/Object;)Z
   #98 = NameAndType        #79:#80       // lambda$distinctByKeys$0:([Ljava/util/function/Function;Ljava/util/Map;Ljava/lang/Object;)Z
   #99 = MethodType         #58           //  (Ljava/lang/Object;)Ljava/lang/Object;
  #100 = MethodHandle       6:#101        // REF_invokeStatic ext/mods/commons/util/PredicateHelpers.lambda$distinctByKeys$1:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #101 = Methodref          #59.#102      // ext/mods/commons/util/PredicateHelpers.lambda$distinctByKeys$1:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #102 = NameAndType        #87:#88       // lambda$distinctByKeys$1:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #103 = MethodType         #104          //  (Ljava/util/function/Function;)Ljava/lang/Object;
  #104 = Utf8               (Ljava/util/function/Function;)Ljava/lang/Object;
  #105 = MethodHandle       6:#106        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #106 = Methodref          #107.#108     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #107 = Class              #109          // java/lang/invoke/LambdaMetafactory
  #108 = NameAndType        #110:#111     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #109 = Utf8               java/lang/invoke/LambdaMetafactory
  #110 = Utf8               metafactory
  #111 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #112 = Utf8               InnerClasses
  #113 = Class              #114          // java/lang/invoke/MethodHandles$Lookup
  #114 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #115 = Class              #116          // java/lang/invoke/MethodHandles
  #116 = Utf8               java/lang/invoke/MethodHandles
  #117 = Utf8               Lookup
{
  public ext.mods.commons.util.PredicateHelpers();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/util/PredicateHelpers;

  public static <T extends java.lang.Object> java.util.function.Predicate<T> distinctByKeys(java.util.function.Function<? super T, ?>...);
    descriptor: ([Ljava/util/function/Function;)Ljava/util/function/Predicate;
    flags: (0x0089) ACC_PUBLIC, ACC_STATIC, ACC_VARARGS
    Code:
      stack=2, locals=2, args_size=1
         0: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         3: dup
         4: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
         7: astore_1
         8: aload_0
         9: aload_1
        10: invokedynamic #10,  0             // InvokeDynamic #0:test:([Ljava/util/function/Function;Ljava/util/Map;)Ljava/util/function/Predicate;
        15: areturn
      LineNumberTable:
        line 33: 0
        line 34: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0 keyExtractors   [Ljava/util/function/Function;
            8       8     1  seen   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      16     0 keyExtractors   [Ljava/util/function/Function<-TT;*>;
            8       8     1  seen   Ljava/util/Map<Ljava/util/List<*>;Ljava/lang/Boolean;>;
    Signature: #76                          // <T:Ljava/lang/Object;>([Ljava/util/function/Function<-TT;*>;)Ljava/util/function/Predicate<TT;>;
    RuntimeVisibleAnnotations:
      0: #78()
        java.lang.SafeVarargs
}
SourceFile: "PredicateHelpers.java"
BootstrapMethods:
  0: #105 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #94 (Ljava/lang/Object;)Z
      #96 REF_invokeStatic ext/mods/commons/util/PredicateHelpers.lambda$distinctByKeys$0:([Ljava/util/function/Function;Ljava/util/Map;Ljava/lang/Object;)Z
      #94 (Ljava/lang/Object;)Z
  1: #105 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #99 (Ljava/lang/Object;)Ljava/lang/Object;
      #100 REF_invokeStatic ext/mods/commons/util/PredicateHelpers.lambda$distinctByKeys$1:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
      #103 (Ljava/util/function/Function;)Ljava/lang/Object;
InnerClasses:
  public static final #117= #113 of #115; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
