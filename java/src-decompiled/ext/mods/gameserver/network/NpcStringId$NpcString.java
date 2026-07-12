// Bytecode for: ext.mods.gameserver.network.NpcStringId$NpcString
// File: ext\mods\gameserver\network\NpcStringId$NpcString.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/NpcStringId$NpcString.class
  Last modified 9 de jul de 2026; size 579 bytes
  MD5 checksum bb525f65d2f03e24a0e6bcc1aea9460e
  Compiled from "NpcStringId.java"
public interface ext.mods.gameserver.network.NpcStringId$NpcString extends java.lang.annotation.Annotation
  minor version: 0
  major version: 69
  flags: (0x2601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT, ACC_ANNOTATION
  this_class: #1                          // ext/mods/gameserver/network/NpcStringId$NpcString
  super_class: #3                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 4
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/network/NpcStringId$NpcString
   #2 = Utf8               ext/mods/gameserver/network/NpcStringId$NpcString
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Class              #6             // java/lang/annotation/Annotation
   #6 = Utf8               java/lang/annotation/Annotation
   #7 = Utf8               id
   #8 = Utf8               ()I
   #9 = Utf8               message
  #10 = Utf8               ()Ljava/lang/String;
  #11 = Utf8               SourceFile
  #12 = Utf8               NpcStringId.java
  #13 = Utf8               RuntimeVisibleAnnotations
  #14 = Utf8               Ljava/lang/annotation/Retention;
  #15 = Utf8               value
  #16 = Utf8               Ljava/lang/annotation/RetentionPolicy;
  #17 = Utf8               RUNTIME
  #18 = Utf8               Ljava/lang/annotation/Target;
  #19 = Utf8               Ljava/lang/annotation/ElementType;
  #20 = Utf8               FIELD
  #21 = Utf8               NestHost
  #22 = Class              #23            // ext/mods/gameserver/network/NpcStringId
  #23 = Utf8               ext/mods/gameserver/network/NpcStringId
  #24 = Utf8               InnerClasses
  #25 = Utf8               NpcString
{
  public abstract int id();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract java.lang.String message();
    descriptor: ()Ljava/lang/String;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "NpcStringId.java"
RuntimeVisibleAnnotations:
  0: #14(#15=e#16.#17)
    java.lang.annotation.Retention(
      value=Ljava/lang/annotation/RetentionPolicy;.RUNTIME
    )
  1: #18(#15=[e#19.#20])
    java.lang.annotation.Target(
      value=[Ljava/lang/annotation/ElementType;.FIELD]
    )
NestHost: class ext/mods/gameserver/network/NpcStringId
InnerClasses:
  public static #25= #1 of #22;           // NpcString=class ext/mods/gameserver/network/NpcStringId$NpcString of class ext/mods/gameserver/network/NpcStringId
