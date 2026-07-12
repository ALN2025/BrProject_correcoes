// Bytecode for: ext.mods.gameserver.handler.SkillHandler
// File: ext\mods\gameserver\handler\SkillHandler.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/SkillHandler.class
  Last modified 9 de jul de 2026; size 2028 bytes
  MD5 checksum ae7e1928104793b605ee5626d30710e5
  Compiled from "SkillHandler.java"
public class ext.mods.gameserver.handler.SkillHandler extends ext.mods.gameserver.handler.AbstractHandler<ext.mods.gameserver.enums.skills.SkillType, ext.mods.gameserver.handler.ISkillHandler>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/handler/SkillHandler
  super_class: #6                         // ext/mods/gameserver/handler/AbstractHandler
  interfaces: 0, fields: 0, methods: 6, attributes: 4
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/handler/ISkillHandler
   #2 = Utf8               ext/mods/gameserver/handler/ISkillHandler
   #3 = String             #4             // skillhandlers
   #4 = Utf8               skillhandlers
   #5 = Methodref          #6.#7          // ext/mods/gameserver/handler/AbstractHandler."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
   #6 = Class              #8             // ext/mods/gameserver/handler/AbstractHandler
   #7 = NameAndType        #9:#10         // "<init>":(Ljava/lang/Class;Ljava/lang/String;)V
   #8 = Utf8               ext/mods/gameserver/handler/AbstractHandler
   #9 = Utf8               <init>
  #10 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)V
  #11 = InterfaceMethodref #1.#12         // ext/mods/gameserver/handler/ISkillHandler.getSkillIds:()[Lext/mods/gameserver/enums/skills/SkillType;
  #12 = NameAndType        #13:#14        // getSkillIds:()[Lext/mods/gameserver/enums/skills/SkillType;
  #13 = Utf8               getSkillIds
  #14 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #15 = Fieldref           #16.#17        // ext/mods/gameserver/handler/SkillHandler._entries:Ljava/util/Map;
  #16 = Class              #18            // ext/mods/gameserver/handler/SkillHandler
  #17 = NameAndType        #19:#20        // _entries:Ljava/util/Map;
  #18 = Utf8               ext/mods/gameserver/handler/SkillHandler
  #19 = Utf8               _entries
  #20 = Utf8               Ljava/util/Map;
  #21 = InterfaceMethodref #22.#23        // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #22 = Class              #24            // java/util/Map
  #23 = NameAndType        #25:#26        // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #24 = Utf8               java/util/Map
  #25 = Utf8               put
  #26 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #27 = Class              #28            // ext/mods/gameserver/enums/skills/SkillType
  #28 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #29 = Methodref          #6.#30         // ext/mods/gameserver/handler/AbstractHandler.getHandler:(Ljava/lang/Object;)Ljava/lang/Object;
  #30 = NameAndType        #31:#32        // getHandler:(Ljava/lang/Object;)Ljava/lang/Object;
  #31 = Utf8               getHandler
  #32 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #33 = Fieldref           #34.#35        // ext/mods/gameserver/handler/SkillHandler$SingletonHolder.INSTANCE:Lext/mods/gameserver/handler/SkillHandler;
  #34 = Class              #36            // ext/mods/gameserver/handler/SkillHandler$SingletonHolder
  #35 = NameAndType        #37:#38        // INSTANCE:Lext/mods/gameserver/handler/SkillHandler;
  #36 = Utf8               ext/mods/gameserver/handler/SkillHandler$SingletonHolder
  #37 = Utf8               INSTANCE
  #38 = Utf8               Lext/mods/gameserver/handler/SkillHandler;
  #39 = Methodref          #16.#40        // ext/mods/gameserver/handler/SkillHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
  #40 = NameAndType        #31:#41        // getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
  #41 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
  #42 = Methodref          #16.#43        // ext/mods/gameserver/handler/SkillHandler.registerHandler:(Lext/mods/gameserver/handler/ISkillHandler;)V
  #43 = NameAndType        #44:#45        // registerHandler:(Lext/mods/gameserver/handler/ISkillHandler;)V
  #44 = Utf8               registerHandler
  #45 = Utf8               (Lext/mods/gameserver/handler/ISkillHandler;)V
  #46 = Utf8               ()V
  #47 = Utf8               Code
  #48 = Utf8               LineNumberTable
  #49 = Utf8               LocalVariableTable
  #50 = Utf8               this
  #51 = Utf8               st
  #52 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #53 = Utf8               handler
  #54 = Utf8               Lext/mods/gameserver/handler/ISkillHandler;
  #55 = Utf8               StackMapTable
  #56 = Class              #57            // "[Lext/mods/gameserver/enums/skills/SkillType;"
  #57 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #58 = Utf8               key
  #59 = Utf8               Ljava/lang/Object;
  #60 = Utf8               getInstance
  #61 = Utf8               ()Lext/mods/gameserver/handler/SkillHandler;
  #62 = Utf8               MethodParameters
  #63 = Utf8               (Ljava/lang/Object;)V
  #64 = Utf8               Signature
  #65 = Utf8               Lext/mods/gameserver/handler/AbstractHandler<Lext/mods/gameserver/enums/skills/SkillType;Lext/mods/gameserver/handler/ISkillHandler;>;
  #66 = Utf8               SourceFile
  #67 = Utf8               SkillHandler.java
  #68 = Utf8               NestMembers
  #69 = Utf8               InnerClasses
  #70 = Utf8               SingletonHolder
{
  protected ext.mods.gameserver.handler.SkillHandler();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: ldc           #1                  // class ext/mods/gameserver/handler/ISkillHandler
         3: ldc           #3                  // String skillhandlers
         5: invokespecial #5                  // Method ext/mods/gameserver/handler/AbstractHandler."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 26: 0
        line 27: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/handler/SkillHandler;

  protected void registerHandler(ext.mods.gameserver.handler.ISkillHandler);
    descriptor: (Lext/mods/gameserver/handler/ISkillHandler;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=6, args_size=2
         0: aload_1
         1: invokeinterface #11,  1           // InterfaceMethod ext/mods/gameserver/handler/ISkillHandler.getSkillIds:()[Lext/mods/gameserver/enums/skills/SkillType;
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
           25      13     5    st   Lext/mods/gameserver/enums/skills/SkillType;
            0      45     0  this   Lext/mods/gameserver/handler/SkillHandler;
            0      45     1 handler   Lext/mods/gameserver/handler/ISkillHandler;
      StackMapTable: number_of_entries = 2
        frame_type = 254 /* append */
          offset_delta = 13
          locals = [ class "[Lext/mods/gameserver/enums/skills/SkillType;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 30

  public ext.mods.gameserver.handler.ISkillHandler getHandler(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: instanceof    #27                 // class ext/mods/gameserver/enums/skills/SkillType
         4: ifeq          15
         7: aload_1
         8: checkcast     #27                 // class ext/mods/gameserver/enums/skills/SkillType
        11: astore_2
        12: goto          17
        15: aconst_null
        16: areturn
        17: aload_0
        18: aload_2
        19: invokespecial #29                 // Method ext/mods/gameserver/handler/AbstractHandler.getHandler:(Ljava/lang/Object;)Ljava/lang/Object;
        22: checkcast     #1                  // class ext/mods/gameserver/handler/ISkillHandler
        25: areturn
      LineNumberTable:
        line 39: 0
        line 40: 15
        line 42: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12       3     2    st   Lext/mods/gameserver/enums/skills/SkillType;
            0      26     0  this   Lext/mods/gameserver/handler/SkillHandler;
            0      26     1   key   Ljava/lang/Object;
           17       9     2    st   Lext/mods/gameserver/enums/skills/SkillType;
      StackMapTable: number_of_entries = 2
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/enums/skills/SkillType ]

  public static ext.mods.gameserver.handler.SkillHandler getInstance();
    descriptor: ()Lext/mods/gameserver/handler/SkillHandler;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #33                 // Field ext/mods/gameserver/handler/SkillHandler$SingletonHolder.INSTANCE:Lext/mods/gameserver/handler/SkillHandler;
         3: areturn
      LineNumberTable:
        line 47: 0

  public java.lang.Object getHandler(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #39                 // Method getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
         5: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/handler/SkillHandler;
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
         2: checkcast     #1                  // class ext/mods/gameserver/handler/ISkillHandler
         5: invokevirtual #42                 // Method registerHandler:(Lext/mods/gameserver/handler/ISkillHandler;)V
         8: return
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/handler/SkillHandler;
    MethodParameters:
      Name                           Flags
      <no name>                      synthetic
}
Signature: #65                          // Lext/mods/gameserver/handler/AbstractHandler<Lext/mods/gameserver/enums/skills/SkillType;Lext/mods/gameserver/handler/ISkillHandler;>;
SourceFile: "SkillHandler.java"
NestMembers:
  ext/mods/gameserver/handler/SkillHandler$SingletonHolder
