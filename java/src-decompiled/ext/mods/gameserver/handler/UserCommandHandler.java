// Bytecode for: ext.mods.gameserver.handler.UserCommandHandler
// File: ext\mods\gameserver\handler\UserCommandHandler.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/UserCommandHandler.class
  Last modified 9 de jul de 2026; size 1589 bytes
  MD5 checksum 97c353e5570d97dba1e4022c622418d2
  Compiled from "UserCommandHandler.java"
public class ext.mods.gameserver.handler.UserCommandHandler extends ext.mods.gameserver.handler.AbstractHandler<java.lang.Integer, ext.mods.gameserver.handler.IUserCommandHandler>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/handler/UserCommandHandler
  super_class: #6                         // ext/mods/gameserver/handler/AbstractHandler
  interfaces: 0, fields: 0, methods: 4, attributes: 4
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/handler/IUserCommandHandler
   #2 = Utf8               ext/mods/gameserver/handler/IUserCommandHandler
   #3 = String             #4             // usercommandhandlers
   #4 = Utf8               usercommandhandlers
   #5 = Methodref          #6.#7          // ext/mods/gameserver/handler/AbstractHandler."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
   #6 = Class              #8             // ext/mods/gameserver/handler/AbstractHandler
   #7 = NameAndType        #9:#10         // "<init>":(Ljava/lang/Class;Ljava/lang/String;)V
   #8 = Utf8               ext/mods/gameserver/handler/AbstractHandler
   #9 = Utf8               <init>
  #10 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)V
  #11 = InterfaceMethodref #1.#12         // ext/mods/gameserver/handler/IUserCommandHandler.getUserCommandList:()[I
  #12 = NameAndType        #13:#14        // getUserCommandList:()[I
  #13 = Utf8               getUserCommandList
  #14 = Utf8               ()[I
  #15 = Fieldref           #16.#17        // ext/mods/gameserver/handler/UserCommandHandler._entries:Ljava/util/Map;
  #16 = Class              #18            // ext/mods/gameserver/handler/UserCommandHandler
  #17 = NameAndType        #19:#20        // _entries:Ljava/util/Map;
  #18 = Utf8               ext/mods/gameserver/handler/UserCommandHandler
  #19 = Utf8               _entries
  #20 = Utf8               Ljava/util/Map;
  #21 = Methodref          #22.#23        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #22 = Class              #24            // java/lang/Integer
  #23 = NameAndType        #25:#26        // valueOf:(I)Ljava/lang/Integer;
  #24 = Utf8               java/lang/Integer
  #25 = Utf8               valueOf
  #26 = Utf8               (I)Ljava/lang/Integer;
  #27 = InterfaceMethodref #28.#29        // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #28 = Class              #30            // java/util/Map
  #29 = NameAndType        #31:#32        // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #30 = Utf8               java/util/Map
  #31 = Utf8               put
  #32 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #33 = Fieldref           #34.#35        // ext/mods/gameserver/handler/UserCommandHandler$SingletonHolder.INSTANCE:Lext/mods/gameserver/handler/UserCommandHandler;
  #34 = Class              #36            // ext/mods/gameserver/handler/UserCommandHandler$SingletonHolder
  #35 = NameAndType        #37:#38        // INSTANCE:Lext/mods/gameserver/handler/UserCommandHandler;
  #36 = Utf8               ext/mods/gameserver/handler/UserCommandHandler$SingletonHolder
  #37 = Utf8               INSTANCE
  #38 = Utf8               Lext/mods/gameserver/handler/UserCommandHandler;
  #39 = Methodref          #16.#40        // ext/mods/gameserver/handler/UserCommandHandler.registerHandler:(Lext/mods/gameserver/handler/IUserCommandHandler;)V
  #40 = NameAndType        #41:#42        // registerHandler:(Lext/mods/gameserver/handler/IUserCommandHandler;)V
  #41 = Utf8               registerHandler
  #42 = Utf8               (Lext/mods/gameserver/handler/IUserCommandHandler;)V
  #43 = Utf8               ()V
  #44 = Utf8               Code
  #45 = Utf8               LineNumberTable
  #46 = Utf8               LocalVariableTable
  #47 = Utf8               this
  #48 = Utf8               id
  #49 = Utf8               I
  #50 = Utf8               handler
  #51 = Utf8               Lext/mods/gameserver/handler/IUserCommandHandler;
  #52 = Utf8               StackMapTable
  #53 = Class              #54            // "[I"
  #54 = Utf8               [I
  #55 = Utf8               getInstance
  #56 = Utf8               ()Lext/mods/gameserver/handler/UserCommandHandler;
  #57 = Utf8               (Ljava/lang/Object;)V
  #58 = Utf8               MethodParameters
  #59 = Utf8               Signature
  #60 = Utf8               Lext/mods/gameserver/handler/AbstractHandler<Ljava/lang/Integer;Lext/mods/gameserver/handler/IUserCommandHandler;>;
  #61 = Utf8               SourceFile
  #62 = Utf8               UserCommandHandler.java
  #63 = Utf8               NestMembers
  #64 = Utf8               InnerClasses
  #65 = Utf8               SingletonHolder
{
  protected ext.mods.gameserver.handler.UserCommandHandler();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: ldc           #1                  // class ext/mods/gameserver/handler/IUserCommandHandler
         3: ldc           #3                  // String usercommandhandlers
         5: invokespecial #5                  // Method ext/mods/gameserver/handler/AbstractHandler."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 24: 0
        line 25: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/handler/UserCommandHandler;

  protected void registerHandler(ext.mods.gameserver.handler.IUserCommandHandler);
    descriptor: (Lext/mods/gameserver/handler/IUserCommandHandler;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=6, args_size=2
         0: aload_1
         1: invokeinterface #11,  1           // InterfaceMethod ext/mods/gameserver/handler/IUserCommandHandler.getUserCommandList:()[I
         6: astore_2
         7: aload_2
         8: arraylength
         9: istore_3
        10: iconst_0
        11: istore        4
        13: iload         4
        15: iload_3
        16: if_icmpge     47
        19: aload_2
        20: iload         4
        22: iaload
        23: istore        5
        25: aload_0
        26: getfield      #15                 // Field _entries:Ljava/util/Map;
        29: iload         5
        31: invokestatic  #21                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        34: aload_1
        35: invokeinterface #27,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        40: pop
        41: iinc          4, 1
        44: goto          13
        47: return
      LineNumberTable:
        line 30: 0
        line 31: 25
        line 30: 41
        line 32: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           25      16     5    id   I
            0      48     0  this   Lext/mods/gameserver/handler/UserCommandHandler;
            0      48     1 handler   Lext/mods/gameserver/handler/IUserCommandHandler;
      StackMapTable: number_of_entries = 2
        frame_type = 254 /* append */
          offset_delta = 13
          locals = [ class "[I", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 33

  public static ext.mods.gameserver.handler.UserCommandHandler getInstance();
    descriptor: ()Lext/mods/gameserver/handler/UserCommandHandler;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #33                 // Field ext/mods/gameserver/handler/UserCommandHandler$SingletonHolder.INSTANCE:Lext/mods/gameserver/handler/UserCommandHandler;
         3: areturn
      LineNumberTable:
        line 36: 0

  protected void registerHandler(java.lang.Object);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x1044) ACC_PROTECTED, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: checkcast     #1                  // class ext/mods/gameserver/handler/IUserCommandHandler
         5: invokevirtual #39                 // Method registerHandler:(Lext/mods/gameserver/handler/IUserCommandHandler;)V
         8: return
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/handler/UserCommandHandler;
    MethodParameters:
      Name                           Flags
      <no name>                      synthetic
}
Signature: #60                          // Lext/mods/gameserver/handler/AbstractHandler<Ljava/lang/Integer;Lext/mods/gameserver/handler/IUserCommandHandler;>;
SourceFile: "UserCommandHandler.java"
NestMembers:
  ext/mods/gameserver/handler/UserCommandHandler$SingletonHolder
