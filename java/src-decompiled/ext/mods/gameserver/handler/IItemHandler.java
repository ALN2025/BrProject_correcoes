// Bytecode for: ext.mods.gameserver.handler.IItemHandler
// File: ext\mods\gameserver\handler\IItemHandler.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/IItemHandler.class
  Last modified 9 de jul de 2026; size 559 bytes
  MD5 checksum d1ce281e31c61ec88def91ae2f4a159c
  Compiled from "IItemHandler.java"
public interface ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #3                          // ext/mods/gameserver/handler/IItemHandler
  super_class: #19                        // java/lang/Object
  interfaces: 0, fields: 1, methods: 2, attributes: 1
Constant pool:
   #1 = Class              #2             // ext/mods/commons/logging/CLogger
   #2 = Utf8               ext/mods/commons/logging/CLogger
   #3 = Class              #4             // ext/mods/gameserver/handler/IItemHandler
   #4 = Utf8               ext/mods/gameserver/handler/IItemHandler
   #5 = Methodref          #6.#7          // java/lang/Class.getName:()Ljava/lang/String;
   #6 = Class              #8             // java/lang/Class
   #7 = NameAndType        #9:#10         // getName:()Ljava/lang/String;
   #8 = Utf8               java/lang/Class
   #9 = Utf8               getName
  #10 = Utf8               ()Ljava/lang/String;
  #11 = Methodref          #1.#12         // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #12 = NameAndType        #13:#14        // "<init>":(Ljava/lang/String;)V
  #13 = Utf8               <init>
  #14 = Utf8               (Ljava/lang/String;)V
  #15 = Fieldref           #3.#16         // ext/mods/gameserver/handler/IItemHandler.LOGGER:Lext/mods/commons/logging/CLogger;
  #16 = NameAndType        #17:#18        // LOGGER:Lext/mods/commons/logging/CLogger;
  #17 = Utf8               LOGGER
  #18 = Utf8               Lext/mods/commons/logging/CLogger;
  #19 = Class              #20            // java/lang/Object
  #20 = Utf8               java/lang/Object
  #21 = Utf8               useItem
  #22 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #23 = Utf8               <clinit>
  #24 = Utf8               ()V
  #25 = Utf8               Code
  #26 = Utf8               LineNumberTable
  #27 = Utf8               SourceFile
  #28 = Utf8               IItemHandler.java
{
  public static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public abstract void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #1                  // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #3                  // class ext/mods/gameserver/handler/IItemHandler
         6: invokevirtual #5                  // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #11                 // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #15                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 30: 0
}
SourceFile: "IItemHandler.java"
