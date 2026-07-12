// Bytecode for: ext.mods.gameserver.handler.ChatHandler
// File: ext\mods\gameserver\handler\ChatHandler.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/ChatHandler.class
  Last modified 9 de jul de 2026; size 1565 bytes
  MD5 checksum 7b3d83781f6a93aea87614521eb2d553
  Compiled from "ChatHandler.java"
public class ext.mods.gameserver.handler.ChatHandler extends ext.mods.gameserver.handler.AbstractHandler<ext.mods.gameserver.enums.SayType, ext.mods.gameserver.handler.IChatHandler>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/handler/ChatHandler
  super_class: #6                         // ext/mods/gameserver/handler/AbstractHandler
  interfaces: 0, fields: 0, methods: 4, attributes: 4
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/handler/IChatHandler
   #2 = Utf8               ext/mods/gameserver/handler/IChatHandler
   #3 = String             #4             // chathandlers
   #4 = Utf8               chathandlers
   #5 = Methodref          #6.#7          // ext/mods/gameserver/handler/AbstractHandler."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
   #6 = Class              #8             // ext/mods/gameserver/handler/AbstractHandler
   #7 = NameAndType        #9:#10         // "<init>":(Ljava/lang/Class;Ljava/lang/String;)V
   #8 = Utf8               ext/mods/gameserver/handler/AbstractHandler
   #9 = Utf8               <init>
  #10 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)V
  #11 = InterfaceMethodref #1.#12         // ext/mods/gameserver/handler/IChatHandler.getChatTypeList:()[Lext/mods/gameserver/enums/SayType;
  #12 = NameAndType        #13:#14        // getChatTypeList:()[Lext/mods/gameserver/enums/SayType;
  #13 = Utf8               getChatTypeList
  #14 = Utf8               ()[Lext/mods/gameserver/enums/SayType;
  #15 = Fieldref           #16.#17        // ext/mods/gameserver/handler/ChatHandler._entries:Ljava/util/Map;
  #16 = Class              #18            // ext/mods/gameserver/handler/ChatHandler
  #17 = NameAndType        #19:#20        // _entries:Ljava/util/Map;
  #18 = Utf8               ext/mods/gameserver/handler/ChatHandler
  #19 = Utf8               _entries
  #20 = Utf8               Ljava/util/Map;
  #21 = InterfaceMethodref #22.#23        // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #22 = Class              #24            // java/util/Map
  #23 = NameAndType        #25:#26        // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #24 = Utf8               java/util/Map
  #25 = Utf8               put
  #26 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #27 = Fieldref           #28.#29        // ext/mods/gameserver/handler/ChatHandler$SingletonHolder.INSTANCE:Lext/mods/gameserver/handler/ChatHandler;
  #28 = Class              #30            // ext/mods/gameserver/handler/ChatHandler$SingletonHolder
  #29 = NameAndType        #31:#32        // INSTANCE:Lext/mods/gameserver/handler/ChatHandler;
  #30 = Utf8               ext/mods/gameserver/handler/ChatHandler$SingletonHolder
  #31 = Utf8               INSTANCE
  #32 = Utf8               Lext/mods/gameserver/handler/ChatHandler;
  #33 = Methodref          #16.#34        // ext/mods/gameserver/handler/ChatHandler.registerHandler:(Lext/mods/gameserver/handler/IChatHandler;)V
  #34 = NameAndType        #35:#36        // registerHandler:(Lext/mods/gameserver/handler/IChatHandler;)V
  #35 = Utf8               registerHandler
  #36 = Utf8               (Lext/mods/gameserver/handler/IChatHandler;)V
  #37 = Utf8               ()V
  #38 = Utf8               Code
  #39 = Utf8               LineNumberTable
  #40 = Utf8               LocalVariableTable
  #41 = Utf8               this
  #42 = Utf8               type
  #43 = Utf8               Lext/mods/gameserver/enums/SayType;
  #44 = Utf8               handler
  #45 = Utf8               Lext/mods/gameserver/handler/IChatHandler;
  #46 = Utf8               StackMapTable
  #47 = Class              #48            // "[Lext/mods/gameserver/enums/SayType;"
  #48 = Utf8               [Lext/mods/gameserver/enums/SayType;
  #49 = Utf8               getInstance
  #50 = Utf8               ()Lext/mods/gameserver/handler/ChatHandler;
  #51 = Utf8               (Ljava/lang/Object;)V
  #52 = Utf8               MethodParameters
  #53 = Utf8               Signature
  #54 = Utf8               Lext/mods/gameserver/handler/AbstractHandler<Lext/mods/gameserver/enums/SayType;Lext/mods/gameserver/handler/IChatHandler;>;
  #55 = Utf8               SourceFile
  #56 = Utf8               ChatHandler.java
  #57 = Utf8               NestMembers
  #58 = Utf8               InnerClasses
  #59 = Utf8               SingletonHolder
{
  protected ext.mods.gameserver.handler.ChatHandler();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: ldc           #1                  // class ext/mods/gameserver/handler/IChatHandler
         3: ldc           #3                  // String chathandlers
         5: invokespecial #5                  // Method ext/mods/gameserver/handler/AbstractHandler."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 26: 0
        line 27: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/handler/ChatHandler;

  protected void registerHandler(ext.mods.gameserver.handler.IChatHandler);
    descriptor: (Lext/mods/gameserver/handler/IChatHandler;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=6, args_size=2
         0: aload_1
         1: invokeinterface #11,  1           // InterfaceMethod ext/mods/gameserver/handler/IChatHandler.getChatTypeList:()[Lext/mods/gameserver/enums/SayType;
         6: astore_2
         7: aload_2
         8: arraylength
         9: istore_3
        10: iconst_0
        11: istore        4
        13: iload         4
        15: iload_3
        16: if_icmpge     44
        19: aload_2
        20: iload         4
        22: aaload
        23: astore        5
        25: aload_0
        26: getfield      #15                 // Field _entries:Ljava/util/Map;
        29: aload         5
        31: aload_1
        32: invokeinterface #21,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        37: pop
        38: iinc          4, 1
        41: goto          13
        44: return
      LineNumberTable:
        line 32: 0
        line 33: 25
        line 32: 38
        line 34: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           25      13     5  type   Lext/mods/gameserver/enums/SayType;
            0      45     0  this   Lext/mods/gameserver/handler/ChatHandler;
            0      45     1 handler   Lext/mods/gameserver/handler/IChatHandler;
      StackMapTable: number_of_entries = 2
        frame_type = 254 /* append */
          offset_delta = 13
          locals = [ class "[Lext/mods/gameserver/enums/SayType;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 30

  public static ext.mods.gameserver.handler.ChatHandler getInstance();
    descriptor: ()Lext/mods/gameserver/handler/ChatHandler;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #27                 // Field ext/mods/gameserver/handler/ChatHandler$SingletonHolder.INSTANCE:Lext/mods/gameserver/handler/ChatHandler;
         3: areturn
      LineNumberTable:
        line 38: 0

  protected void registerHandler(java.lang.Object);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x1044) ACC_PROTECTED, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: checkcast     #1                  // class ext/mods/gameserver/handler/IChatHandler
         5: invokevirtual #33                 // Method registerHandler:(Lext/mods/gameserver/handler/IChatHandler;)V
         8: return
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/handler/ChatHandler;
    MethodParameters:
      Name                           Flags
      <no name>                      synthetic
}
Signature: #54                          // Lext/mods/gameserver/handler/AbstractHandler<Lext/mods/gameserver/enums/SayType;Lext/mods/gameserver/handler/IChatHandler;>;
SourceFile: "ChatHandler.java"
NestMembers:
  ext/mods/gameserver/handler/ChatHandler$SingletonHolder
