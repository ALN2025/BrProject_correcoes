// Bytecode for: ext.mods.gameserver.handler.VoicedCommandHandler
// File: ext\mods\gameserver\handler\VoicedCommandHandler.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/VoicedCommandHandler.class
  Last modified 9 de jul de 2026; size 2471 bytes
  MD5 checksum b7ee7ef6b558b7de7f333fe5d139ac39
  Compiled from "VoicedCommandHandler.java"
public class ext.mods.gameserver.handler.VoicedCommandHandler extends ext.mods.gameserver.handler.AbstractHandler<java.lang.Integer, ext.mods.gameserver.handler.IVoicedCommandHandler>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/handler/VoicedCommandHandler
  super_class: #6                         // ext/mods/gameserver/handler/AbstractHandler
  interfaces: 0, fields: 0, methods: 8, attributes: 4
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/handler/IVoicedCommandHandler
   #2 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
   #3 = String             #4             // voicedcommandhandlers
   #4 = Utf8               voicedcommandhandlers
   #5 = Methodref          #6.#7          // ext/mods/gameserver/handler/AbstractHandler."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
   #6 = Class              #8             // ext/mods/gameserver/handler/AbstractHandler
   #7 = NameAndType        #9:#10         // "<init>":(Ljava/lang/Class;Ljava/lang/String;)V
   #8 = Utf8               ext/mods/gameserver/handler/AbstractHandler
   #9 = Utf8               <init>
  #10 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)V
  #11 = InterfaceMethodref #1.#12         // ext/mods/gameserver/handler/IVoicedCommandHandler.getVoicedCommandList:()[Ljava/lang/String;
  #12 = NameAndType        #13:#14        // getVoicedCommandList:()[Ljava/lang/String;
  #13 = Utf8               getVoicedCommandList
  #14 = Utf8               ()[Ljava/lang/String;
  #15 = Fieldref           #16.#17        // ext/mods/gameserver/handler/VoicedCommandHandler._entries:Ljava/util/Map;
  #16 = Class              #18            // ext/mods/gameserver/handler/VoicedCommandHandler
  #17 = NameAndType        #19:#20        // _entries:Ljava/util/Map;
  #18 = Utf8               ext/mods/gameserver/handler/VoicedCommandHandler
  #19 = Utf8               _entries
  #20 = Utf8               Ljava/util/Map;
  #21 = Methodref          #22.#23        // java/lang/String.hashCode:()I
  #22 = Class              #24            // java/lang/String
  #23 = NameAndType        #25:#26        // hashCode:()I
  #24 = Utf8               java/lang/String
  #25 = Utf8               hashCode
  #26 = Utf8               ()I
  #27 = Methodref          #28.#29        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #28 = Class              #30            // java/lang/Integer
  #29 = NameAndType        #31:#32        // valueOf:(I)Ljava/lang/Integer;
  #30 = Utf8               java/lang/Integer
  #31 = Utf8               valueOf
  #32 = Utf8               (I)Ljava/lang/Integer;
  #33 = InterfaceMethodref #34.#35        // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #34 = Class              #36            // java/util/Map
  #35 = NameAndType        #37:#38        // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #36 = Utf8               java/util/Map
  #37 = Utf8               put
  #38 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #39 = String             #40            //
  #40 = Utf8
  #41 = Methodref          #22.#42        // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #42 = NameAndType        #43:#44        // split:(Ljava/lang/String;)[Ljava/lang/String;
  #43 = Utf8               split
  #44 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #45 = InterfaceMethodref #34.#46        // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #46 = NameAndType        #47:#48        // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #47 = Utf8               get
  #48 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #49 = InterfaceMethodref #34.#50        // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #50 = NameAndType        #51:#48        // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #51 = Utf8               remove
  #52 = InterfaceMethodref #34.#53        // java/util/Map.size:()I
  #53 = NameAndType        #54:#26        // size:()I
  #54 = Utf8               size
  #55 = Fieldref           #56.#57        // ext/mods/gameserver/handler/VoicedCommandHandler$SingletonHolder.INSTANCE:Lext/mods/gameserver/handler/VoicedCommandHandler;
  #56 = Class              #58            // ext/mods/gameserver/handler/VoicedCommandHandler$SingletonHolder
  #57 = NameAndType        #59:#60        // INSTANCE:Lext/mods/gameserver/handler/VoicedCommandHandler;
  #58 = Utf8               ext/mods/gameserver/handler/VoicedCommandHandler$SingletonHolder
  #59 = Utf8               INSTANCE
  #60 = Utf8               Lext/mods/gameserver/handler/VoicedCommandHandler;
  #61 = Methodref          #16.#62        // ext/mods/gameserver/handler/VoicedCommandHandler.registerHandler:(Lext/mods/gameserver/handler/IVoicedCommandHandler;)V
  #62 = NameAndType        #63:#64        // registerHandler:(Lext/mods/gameserver/handler/IVoicedCommandHandler;)V
  #63 = Utf8               registerHandler
  #64 = Utf8               (Lext/mods/gameserver/handler/IVoicedCommandHandler;)V
  #65 = Utf8               ()V
  #66 = Utf8               Code
  #67 = Utf8               LineNumberTable
  #68 = Utf8               LocalVariableTable
  #69 = Utf8               this
  #70 = Utf8               id
  #71 = Utf8               Ljava/lang/String;
  #72 = Utf8               handler
  #73 = Utf8               Lext/mods/gameserver/handler/IVoicedCommandHandler;
  #74 = Utf8               StackMapTable
  #75 = Class              #76            // "[Ljava/lang/String;"
  #76 = Utf8               [Ljava/lang/String;
  #77 = Utf8               getHandler
  #78 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/handler/IVoicedCommandHandler;
  #79 = Utf8               voicedCommand
  #80 = Utf8               command
  #81 = Utf8               unregisterHandler
  #82 = Utf8               unregisterCommand
  #83 = Utf8               (Ljava/lang/String;)V
  #84 = Utf8               getInstance
  #85 = Utf8               ()Lext/mods/gameserver/handler/VoicedCommandHandler;
  #86 = Utf8               (Ljava/lang/Object;)V
  #87 = Utf8               MethodParameters
  #88 = Utf8               Signature
  #89 = Utf8               Lext/mods/gameserver/handler/AbstractHandler<Ljava/lang/Integer;Lext/mods/gameserver/handler/IVoicedCommandHandler;>;
  #90 = Utf8               SourceFile
  #91 = Utf8               VoicedCommandHandler.java
  #92 = Utf8               NestMembers
  #93 = Utf8               InnerClasses
  #94 = Utf8               SingletonHolder
{
  protected ext.mods.gameserver.handler.VoicedCommandHandler();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: ldc           #1                  // class ext/mods/gameserver/handler/IVoicedCommandHandler
         3: ldc           #3                  // String voicedcommandhandlers
         5: invokespecial #5                  // Method ext/mods/gameserver/handler/AbstractHandler."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 24: 0
        line 25: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/handler/VoicedCommandHandler;

  public void registerHandler(ext.mods.gameserver.handler.IVoicedCommandHandler);
    descriptor: (Lext/mods/gameserver/handler/IVoicedCommandHandler;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: aload_1
         1: invokeinterface #11,  1           // InterfaceMethod ext/mods/gameserver/handler/IVoicedCommandHandler.getVoicedCommandList:()[Ljava/lang/String;
         6: astore_2
         7: aload_2
         8: arraylength
         9: istore_3
        10: iconst_0
        11: istore        4
        13: iload         4
        15: iload_3
        16: if_icmpge     50
        19: aload_2
        20: iload         4
        22: aaload
        23: astore        5
        25: aload_0
        26: getfield      #15                 // Field _entries:Ljava/util/Map;
        29: aload         5
        31: invokevirtual #21                 // Method java/lang/String.hashCode:()I
        34: invokestatic  #27                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        37: aload_1
        38: invokeinterface #33,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        43: pop
        44: iinc          4, 1
        47: goto          13
        50: return
      LineNumberTable:
        line 30: 0
        line 31: 25
        line 30: 44
        line 32: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           25      19     5    id   Ljava/lang/String;
            0      51     0  this   Lext/mods/gameserver/handler/VoicedCommandHandler;
            0      51     1 handler   Lext/mods/gameserver/handler/IVoicedCommandHandler;
      StackMapTable: number_of_entries = 2
        frame_type = 254 /* append */
          offset_delta = 13
          locals = [ class "[Ljava/lang/String;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 36

  public ext.mods.gameserver.handler.IVoicedCommandHandler getHandler(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/handler/IVoicedCommandHandler;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: ldc           #39                 // String
         3: invokevirtual #41                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
         6: iconst_0
         7: aaload
         8: astore_2
         9: aload_0
        10: getfield      #15                 // Field _entries:Ljava/util/Map;
        13: aload_2
        14: invokevirtual #21                 // Method java/lang/String.hashCode:()I
        17: invokestatic  #27                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        20: invokeinterface #45,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        25: checkcast     #1                  // class ext/mods/gameserver/handler/IVoicedCommandHandler
        28: areturn
      LineNumberTable:
        line 36: 0
        line 37: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/handler/VoicedCommandHandler;
            0      29     1 voicedCommand   Ljava/lang/String;
            9      20     2 command   Ljava/lang/String;

  public void unregisterHandler(ext.mods.gameserver.handler.IVoicedCommandHandler);
    descriptor: (Lext/mods/gameserver/handler/IVoicedCommandHandler;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=2
         0: aload_1
         1: invokeinterface #11,  1           // InterfaceMethod ext/mods/gameserver/handler/IVoicedCommandHandler.getVoicedCommandList:()[Ljava/lang/String;
         6: astore_2
         7: aload_2
         8: arraylength
         9: istore_3
        10: iconst_0
        11: istore        4
        13: iload         4
        15: iload_3
        16: if_icmpge     49
        19: aload_2
        20: iload         4
        22: aaload
        23: astore        5
        25: aload_0
        26: getfield      #15                 // Field _entries:Ljava/util/Map;
        29: aload         5
        31: invokevirtual #21                 // Method java/lang/String.hashCode:()I
        34: invokestatic  #27                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        37: invokeinterface #49,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        42: pop
        43: iinc          4, 1
        46: goto          13
        49: return
      LineNumberTable:
        line 42: 0
        line 44: 25
        line 42: 43
        line 46: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           25      18     5    id   Ljava/lang/String;
            0      50     0  this   Lext/mods/gameserver/handler/VoicedCommandHandler;
            0      50     1 handler   Lext/mods/gameserver/handler/IVoicedCommandHandler;
      StackMapTable: number_of_entries = 2
        frame_type = 254 /* append */
          offset_delta = 13
          locals = [ class "[Ljava/lang/String;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 35

  public void unregisterCommand(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #15                 // Field _entries:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #21                 // Method java/lang/String.hashCode:()I
         8: invokestatic  #27                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: invokeinterface #49,  2           // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        16: pop
        17: return
      LineNumberTable:
        line 50: 0
        line 51: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/handler/VoicedCommandHandler;
            0      18     1 command   Ljava/lang/String;

  public int size();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _entries:Ljava/util/Map;
         4: invokeinterface #52,  1           // InterfaceMethod java/util/Map.size:()I
         9: ireturn
      LineNumberTable:
        line 56: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/handler/VoicedCommandHandler;

  public static ext.mods.gameserver.handler.VoicedCommandHandler getInstance();
    descriptor: ()Lext/mods/gameserver/handler/VoicedCommandHandler;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #55                 // Field ext/mods/gameserver/handler/VoicedCommandHandler$SingletonHolder.INSTANCE:Lext/mods/gameserver/handler/VoicedCommandHandler;
         3: areturn
      LineNumberTable:
        line 61: 0

  public void registerHandler(java.lang.Object);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: checkcast     #1                  // class ext/mods/gameserver/handler/IVoicedCommandHandler
         5: invokevirtual #61                 // Method registerHandler:(Lext/mods/gameserver/handler/IVoicedCommandHandler;)V
         8: return
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/handler/VoicedCommandHandler;
    MethodParameters:
      Name                           Flags
      <no name>                      synthetic
}
Signature: #89                          // Lext/mods/gameserver/handler/AbstractHandler<Ljava/lang/Integer;Lext/mods/gameserver/handler/IVoicedCommandHandler;>;
SourceFile: "VoicedCommandHandler.java"
NestMembers:
  ext/mods/gameserver/handler/VoicedCommandHandler$SingletonHolder
