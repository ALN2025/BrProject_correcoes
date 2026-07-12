// Bytecode for: ext.mods.gameserver.handler.TargetHandler
// File: ext\mods\gameserver\handler\TargetHandler.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/TargetHandler.class
  Last modified 9 de jul de 2026; size 1445 bytes
  MD5 checksum 488e028e52719a86fc41ea4573c6c52f
  Compiled from "TargetHandler.java"
public class ext.mods.gameserver.handler.TargetHandler extends ext.mods.gameserver.handler.AbstractHandler<ext.mods.gameserver.enums.skills.SkillTargetType, ext.mods.gameserver.handler.ITargetHandler>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #12                         // ext/mods/gameserver/handler/TargetHandler
  super_class: #6                         // ext/mods/gameserver/handler/AbstractHandler
  interfaces: 0, fields: 0, methods: 4, attributes: 4
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/handler/ITargetHandler
   #2 = Utf8               ext/mods/gameserver/handler/ITargetHandler
   #3 = String             #4             // targethandlers
   #4 = Utf8               targethandlers
   #5 = Methodref          #6.#7          // ext/mods/gameserver/handler/AbstractHandler."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
   #6 = Class              #8             // ext/mods/gameserver/handler/AbstractHandler
   #7 = NameAndType        #9:#10         // "<init>":(Ljava/lang/Class;Ljava/lang/String;)V
   #8 = Utf8               ext/mods/gameserver/handler/AbstractHandler
   #9 = Utf8               <init>
  #10 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)V
  #11 = Fieldref           #12.#13        // ext/mods/gameserver/handler/TargetHandler._entries:Ljava/util/Map;
  #12 = Class              #14            // ext/mods/gameserver/handler/TargetHandler
  #13 = NameAndType        #15:#16        // _entries:Ljava/util/Map;
  #14 = Utf8               ext/mods/gameserver/handler/TargetHandler
  #15 = Utf8               _entries
  #16 = Utf8               Ljava/util/Map;
  #17 = InterfaceMethodref #1.#18         // ext/mods/gameserver/handler/ITargetHandler.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #18 = NameAndType        #19:#20        // getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #19 = Utf8               getTargetType
  #20 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #21 = InterfaceMethodref #22.#23        // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #22 = Class              #24            // java/util/Map
  #23 = NameAndType        #25:#26        // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #24 = Utf8               java/util/Map
  #25 = Utf8               put
  #26 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #27 = Fieldref           #28.#29        // ext/mods/gameserver/handler/TargetHandler$SingletonHolder.INSTANCE:Lext/mods/gameserver/handler/TargetHandler;
  #28 = Class              #30            // ext/mods/gameserver/handler/TargetHandler$SingletonHolder
  #29 = NameAndType        #31:#32        // INSTANCE:Lext/mods/gameserver/handler/TargetHandler;
  #30 = Utf8               ext/mods/gameserver/handler/TargetHandler$SingletonHolder
  #31 = Utf8               INSTANCE
  #32 = Utf8               Lext/mods/gameserver/handler/TargetHandler;
  #33 = Methodref          #12.#34        // ext/mods/gameserver/handler/TargetHandler.registerHandler:(Lext/mods/gameserver/handler/ITargetHandler;)V
  #34 = NameAndType        #35:#36        // registerHandler:(Lext/mods/gameserver/handler/ITargetHandler;)V
  #35 = Utf8               registerHandler
  #36 = Utf8               (Lext/mods/gameserver/handler/ITargetHandler;)V
  #37 = Utf8               ()V
  #38 = Utf8               Code
  #39 = Utf8               LineNumberTable
  #40 = Utf8               LocalVariableTable
  #41 = Utf8               this
  #42 = Utf8               handler
  #43 = Utf8               Lext/mods/gameserver/handler/ITargetHandler;
  #44 = Utf8               getInstance
  #45 = Utf8               ()Lext/mods/gameserver/handler/TargetHandler;
  #46 = Utf8               (Ljava/lang/Object;)V
  #47 = Utf8               MethodParameters
  #48 = Utf8               Signature
  #49 = Utf8               Lext/mods/gameserver/handler/AbstractHandler<Lext/mods/gameserver/enums/skills/SkillTargetType;Lext/mods/gameserver/handler/ITargetHandler;>;
  #50 = Utf8               SourceFile
  #51 = Utf8               TargetHandler.java
  #52 = Utf8               NestMembers
  #53 = Utf8               InnerClasses
  #54 = Utf8               SingletonHolder
{
  protected ext.mods.gameserver.handler.TargetHandler();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: ldc           #1                  // class ext/mods/gameserver/handler/ITargetHandler
         3: ldc           #3                  // String targethandlers
         5: invokespecial #5                  // Method ext/mods/gameserver/handler/AbstractHandler."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 26: 0
        line 27: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/handler/TargetHandler;

  protected void registerHandler(ext.mods.gameserver.handler.ITargetHandler);
    descriptor: (Lext/mods/gameserver/handler/ITargetHandler;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #11                 // Field _entries:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #17,  1           // InterfaceMethod ext/mods/gameserver/handler/ITargetHandler.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
        10: aload_1
        11: invokeinterface #21,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        16: pop
        17: return
      LineNumberTable:
        line 32: 0
        line 33: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/handler/TargetHandler;
            0      18     1 handler   Lext/mods/gameserver/handler/ITargetHandler;

  public static ext.mods.gameserver.handler.TargetHandler getInstance();
    descriptor: ()Lext/mods/gameserver/handler/TargetHandler;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #27                 // Field ext/mods/gameserver/handler/TargetHandler$SingletonHolder.INSTANCE:Lext/mods/gameserver/handler/TargetHandler;
         3: areturn
      LineNumberTable:
        line 37: 0

  protected void registerHandler(java.lang.Object);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x1044) ACC_PROTECTED, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: checkcast     #1                  // class ext/mods/gameserver/handler/ITargetHandler
         5: invokevirtual #33                 // Method registerHandler:(Lext/mods/gameserver/handler/ITargetHandler;)V
         8: return
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/handler/TargetHandler;
    MethodParameters:
      Name                           Flags
      <no name>                      synthetic
}
Signature: #49                          // Lext/mods/gameserver/handler/AbstractHandler<Lext/mods/gameserver/enums/skills/SkillTargetType;Lext/mods/gameserver/handler/ITargetHandler;>;
SourceFile: "TargetHandler.java"
NestMembers:
  ext/mods/gameserver/handler/TargetHandler$SingletonHolder
