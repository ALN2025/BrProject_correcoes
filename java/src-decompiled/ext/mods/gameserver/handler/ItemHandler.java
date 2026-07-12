// Bytecode for: ext.mods.gameserver.handler.ItemHandler
// File: ext\mods\gameserver\handler\ItemHandler.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/ItemHandler.class
  Last modified 9 de jul de 2026; size 2277 bytes
  MD5 checksum a1dcd1248dd584f8319b1fe87278f09e
  Compiled from "ItemHandler.java"
public class ext.mods.gameserver.handler.ItemHandler extends ext.mods.gameserver.handler.AbstractHandler<java.lang.Integer, ext.mods.gameserver.handler.IItemHandler>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #17                         // ext/mods/gameserver/handler/ItemHandler
  super_class: #6                         // ext/mods/gameserver/handler/AbstractHandler
  interfaces: 0, fields: 0, methods: 6, attributes: 4
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/handler/IItemHandler
    #2 = Utf8               ext/mods/gameserver/handler/IItemHandler
    #3 = String             #4            // itemhandlers
    #4 = Utf8               itemhandlers
    #5 = Methodref          #6.#7         // ext/mods/gameserver/handler/AbstractHandler."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
    #6 = Class              #8            // ext/mods/gameserver/handler/AbstractHandler
    #7 = NameAndType        #9:#10        // "<init>":(Ljava/lang/Class;Ljava/lang/String;)V
    #8 = Utf8               ext/mods/gameserver/handler/AbstractHandler
    #9 = Utf8               <init>
   #10 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)V
   #11 = Class              #12           // ext/mods/gameserver/handler/itemhandlers/ItemNobles
   #12 = Utf8               ext/mods/gameserver/handler/itemhandlers/ItemNobles
   #13 = Methodref          #11.#14       // ext/mods/gameserver/handler/itemhandlers/ItemNobles."<init>":()V
   #14 = NameAndType        #9:#15        // "<init>":()V
   #15 = Utf8               ()V
   #16 = Methodref          #17.#18       // ext/mods/gameserver/handler/ItemHandler.registerHandler:(Lext/mods/gameserver/handler/IItemHandler;)V
   #17 = Class              #19           // ext/mods/gameserver/handler/ItemHandler
   #18 = NameAndType        #20:#21       // registerHandler:(Lext/mods/gameserver/handler/IItemHandler;)V
   #19 = Utf8               ext/mods/gameserver/handler/ItemHandler
   #20 = Utf8               registerHandler
   #21 = Utf8               (Lext/mods/gameserver/handler/IItemHandler;)V
   #22 = Class              #23           // ext/mods/gameserver/handler/itemhandlers/CapsuleBox_System
   #23 = Utf8               ext/mods/gameserver/handler/itemhandlers/CapsuleBox_System
   #24 = Methodref          #22.#14       // ext/mods/gameserver/handler/itemhandlers/CapsuleBox_System."<init>":()V
   #25 = Fieldref           #17.#26       // ext/mods/gameserver/handler/ItemHandler._entries:Ljava/util/Map;
   #26 = NameAndType        #27:#28       // _entries:Ljava/util/Map;
   #27 = Utf8               _entries
   #28 = Utf8               Ljava/util/Map;
   #29 = InterfaceMethodref #1.#30        // ext/mods/gameserver/handler/IItemHandler.getClass:()Ljava/lang/Class;
   #30 = NameAndType        #31:#32       // getClass:()Ljava/lang/Class;
   #31 = Utf8               getClass
   #32 = Utf8               ()Ljava/lang/Class;
   #33 = Methodref          #34.#35       // java/lang/Class.getSimpleName:()Ljava/lang/String;
   #34 = Class              #36           // java/lang/Class
   #35 = NameAndType        #37:#38       // getSimpleName:()Ljava/lang/String;
   #36 = Utf8               java/lang/Class
   #37 = Utf8               getSimpleName
   #38 = Utf8               ()Ljava/lang/String;
   #39 = Methodref          #40.#41       // java/lang/String.intern:()Ljava/lang/String;
   #40 = Class              #42           // java/lang/String
   #41 = NameAndType        #43:#38       // intern:()Ljava/lang/String;
   #42 = Utf8               java/lang/String
   #43 = Utf8               intern
   #44 = Methodref          #40.#45       // java/lang/String.hashCode:()I
   #45 = NameAndType        #46:#47       // hashCode:()I
   #46 = Utf8               hashCode
   #47 = Utf8               ()I
   #48 = Methodref          #49.#50       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #49 = Class              #51           // java/lang/Integer
   #50 = NameAndType        #52:#53       // valueOf:(I)Ljava/lang/Integer;
   #51 = Utf8               java/lang/Integer
   #52 = Utf8               valueOf
   #53 = Utf8               (I)Ljava/lang/Integer;
   #54 = InterfaceMethodref #55.#56       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #55 = Class              #57           // java/util/Map
   #56 = NameAndType        #58:#59       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #57 = Utf8               java/util/Map
   #58 = Utf8               put
   #59 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #60 = Class              #61           // ext/mods/gameserver/model/item/kind/EtcItem
   #61 = Utf8               ext/mods/gameserver/model/item/kind/EtcItem
   #62 = Methodref          #60.#63       // ext/mods/gameserver/model/item/kind/EtcItem.getHandlerName:()Ljava/lang/String;
   #63 = NameAndType        #64:#38       // getHandlerName:()Ljava/lang/String;
   #64 = Utf8               getHandlerName
   #65 = Methodref          #6.#66        // ext/mods/gameserver/handler/AbstractHandler.getHandler:(Ljava/lang/Object;)Ljava/lang/Object;
   #66 = NameAndType        #67:#68       // getHandler:(Ljava/lang/Object;)Ljava/lang/Object;
   #67 = Utf8               getHandler
   #68 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #69 = Fieldref           #70.#71       // ext/mods/gameserver/handler/ItemHandler$SingletonHolder.INSTANCE:Lext/mods/gameserver/handler/ItemHandler;
   #70 = Class              #72           // ext/mods/gameserver/handler/ItemHandler$SingletonHolder
   #71 = NameAndType        #73:#74       // INSTANCE:Lext/mods/gameserver/handler/ItemHandler;
   #72 = Utf8               ext/mods/gameserver/handler/ItemHandler$SingletonHolder
   #73 = Utf8               INSTANCE
   #74 = Utf8               Lext/mods/gameserver/handler/ItemHandler;
   #75 = Methodref          #17.#76       // ext/mods/gameserver/handler/ItemHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
   #76 = NameAndType        #67:#77       // getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
   #77 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
   #78 = Utf8               Code
   #79 = Utf8               LineNumberTable
   #80 = Utf8               LocalVariableTable
   #81 = Utf8               this
   #82 = Utf8               handler
   #83 = Utf8               Lext/mods/gameserver/handler/IItemHandler;
   #84 = Utf8               etcItem
   #85 = Utf8               Lext/mods/gameserver/model/item/kind/EtcItem;
   #86 = Utf8               key
   #87 = Utf8               Ljava/lang/Object;
   #88 = Utf8               StackMapTable
   #89 = Utf8               getInstance
   #90 = Utf8               ()Lext/mods/gameserver/handler/ItemHandler;
   #91 = Utf8               MethodParameters
   #92 = Utf8               (Ljava/lang/Object;)V
   #93 = Utf8               Signature
   #94 = Utf8               Lext/mods/gameserver/handler/AbstractHandler<Ljava/lang/Integer;Lext/mods/gameserver/handler/IItemHandler;>;
   #95 = Utf8               SourceFile
   #96 = Utf8               ItemHandler.java
   #97 = Utf8               NestMembers
   #98 = Utf8               InnerClasses
   #99 = Utf8               SingletonHolder
{
  protected ext.mods.gameserver.handler.ItemHandler();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: ldc           #1                  // class ext/mods/gameserver/handler/IItemHandler
         3: ldc           #3                  // String itemhandlers
         5: invokespecial #5                  // Method ext/mods/gameserver/handler/AbstractHandler."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
         8: aload_0
         9: new           #11                 // class ext/mods/gameserver/handler/itemhandlers/ItemNobles
        12: dup
        13: invokespecial #13                 // Method ext/mods/gameserver/handler/itemhandlers/ItemNobles."<init>":()V
        16: invokevirtual #16                 // Method registerHandler:(Lext/mods/gameserver/handler/IItemHandler;)V
        19: aload_0
        20: new           #22                 // class ext/mods/gameserver/handler/itemhandlers/CapsuleBox_System
        23: dup
        24: invokespecial #24                 // Method ext/mods/gameserver/handler/itemhandlers/CapsuleBox_System."<init>":()V
        27: invokevirtual #16                 // Method registerHandler:(Lext/mods/gameserver/handler/IItemHandler;)V
        30: return
      LineNumberTable:
        line 28: 0
        line 29: 8
        line 30: 19
        line 31: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/handler/ItemHandler;

  protected void registerHandler(ext.mods.gameserver.handler.IItemHandler);
    descriptor: (Lext/mods/gameserver/handler/IItemHandler;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #25                 // Field _entries:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #29,  1           // InterfaceMethod ext/mods/gameserver/handler/IItemHandler.getClass:()Ljava/lang/Class;
        10: invokevirtual #33                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
        13: invokevirtual #39                 // Method java/lang/String.intern:()Ljava/lang/String;
        16: invokevirtual #44                 // Method java/lang/String.hashCode:()I
        19: invokestatic  #48                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        22: aload_1
        23: invokeinterface #54,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        28: pop
        29: return
      LineNumberTable:
        line 36: 0
        line 37: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/handler/ItemHandler;
            0      30     1 handler   Lext/mods/gameserver/handler/IItemHandler;

  public ext.mods.gameserver.handler.IItemHandler getHandler(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: instanceof    #60                 // class ext/mods/gameserver/model/item/kind/EtcItem
         4: ifeq          19
         7: aload_1
         8: checkcast     #60                 // class ext/mods/gameserver/model/item/kind/EtcItem
        11: astore_2
        12: aload_2
        13: invokevirtual #62                 // Method ext/mods/gameserver/model/item/kind/EtcItem.getHandlerName:()Ljava/lang/String;
        16: ifnonnull     21
        19: aconst_null
        20: areturn
        21: aload_0
        22: aload_2
        23: invokevirtual #62                 // Method ext/mods/gameserver/model/item/kind/EtcItem.getHandlerName:()Ljava/lang/String;
        26: invokevirtual #44                 // Method java/lang/String.hashCode:()I
        29: invokestatic  #48                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        32: invokespecial #65                 // Method ext/mods/gameserver/handler/AbstractHandler.getHandler:(Ljava/lang/Object;)Ljava/lang/Object;
        35: checkcast     #1                  // class ext/mods/gameserver/handler/IItemHandler
        38: areturn
      LineNumberTable:
        line 42: 0
        line 43: 19
        line 45: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12       7     2 etcItem   Lext/mods/gameserver/model/item/kind/EtcItem;
            0      39     0  this   Lext/mods/gameserver/handler/ItemHandler;
            0      39     1   key   Ljava/lang/Object;
           21      18     2 etcItem   Lext/mods/gameserver/model/item/kind/EtcItem;
      StackMapTable: number_of_entries = 2
        frame_type = 19 /* same */
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/item/kind/EtcItem ]

  public static ext.mods.gameserver.handler.ItemHandler getInstance();
    descriptor: ()Lext/mods/gameserver/handler/ItemHandler;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #69                 // Field ext/mods/gameserver/handler/ItemHandler$SingletonHolder.INSTANCE:Lext/mods/gameserver/handler/ItemHandler;
         3: areturn
      LineNumberTable:
        line 50: 0

  public java.lang.Object getHandler(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #75                 // Method getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
         5: areturn
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/handler/ItemHandler;
    MethodParameters:
      Name                           Flags
      <no name>                      synthetic

  protected void registerHandler(java.lang.Object);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x1044) ACC_PROTECTED, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: checkcast     #1                  // class ext/mods/gameserver/handler/IItemHandler
         5: invokevirtual #16                 // Method registerHandler:(Lext/mods/gameserver/handler/IItemHandler;)V
         8: return
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/handler/ItemHandler;
    MethodParameters:
      Name                           Flags
      <no name>                      synthetic
}
Signature: #94                          // Lext/mods/gameserver/handler/AbstractHandler<Ljava/lang/Integer;Lext/mods/gameserver/handler/IItemHandler;>;
SourceFile: "ItemHandler.java"
NestMembers:
  ext/mods/gameserver/handler/ItemHandler$SingletonHolder
