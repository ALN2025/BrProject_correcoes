// Bytecode for: ext.mods.gameserver.enums.items.ItemState
// File: ext\mods\gameserver\enums\items\ItemState.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/items/ItemState.class
  Last modified 9 de jul de 2026; size 1280 bytes
  MD5 checksum 6d4eb446e542e0507a0b15842e67e21b
  Compiled from "ItemState.java"
public final class ext.mods.gameserver.enums.items.ItemState extends java.lang.Enum<ext.mods.gameserver.enums.items.ItemState>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/items/ItemState
  super_class: #26                        // java/lang/Enum
  interfaces: 0, fields: 5, methods: 5, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/items/ItemState
   #2 = Utf8               ext/mods/gameserver/enums/items/ItemState
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/items/ItemState.UNCHANGED:Lext/mods/gameserver/enums/items/ItemState;
   #4 = NameAndType        #5:#6          // UNCHANGED:Lext/mods/gameserver/enums/items/ItemState;
   #5 = Utf8               UNCHANGED
   #6 = Utf8               Lext/mods/gameserver/enums/items/ItemState;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/items/ItemState.ADDED:Lext/mods/gameserver/enums/items/ItemState;
   #8 = NameAndType        #9:#6          // ADDED:Lext/mods/gameserver/enums/items/ItemState;
   #9 = Utf8               ADDED
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/items/ItemState.MODIFIED:Lext/mods/gameserver/enums/items/ItemState;
  #11 = NameAndType        #12:#6         // MODIFIED:Lext/mods/gameserver/enums/items/ItemState;
  #12 = Utf8               MODIFIED
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/items/ItemState.REMOVED:Lext/mods/gameserver/enums/items/ItemState;
  #14 = NameAndType        #15:#6         // REMOVED:Lext/mods/gameserver/enums/items/ItemState;
  #15 = Utf8               REMOVED
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/items/ItemState.$VALUES:[Lext/mods/gameserver/enums/items/ItemState;
  #17 = NameAndType        #18:#19        // $VALUES:[Lext/mods/gameserver/enums/items/ItemState;
  #18 = Utf8               $VALUES
  #19 = Utf8               [Lext/mods/gameserver/enums/items/ItemState;
  #20 = Methodref          #21.#22        // "[Lext/mods/gameserver/enums/items/ItemState;".clone:()Ljava/lang/Object;
  #21 = Class              #19            // "[Lext/mods/gameserver/enums/items/ItemState;"
  #22 = NameAndType        #23:#24        // clone:()Ljava/lang/Object;
  #23 = Utf8               clone
  #24 = Utf8               ()Ljava/lang/Object;
  #25 = Methodref          #26.#27        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #26 = Class              #28            // java/lang/Enum
  #27 = NameAndType        #29:#30        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #28 = Utf8               java/lang/Enum
  #29 = Utf8               valueOf
  #30 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #31 = Methodref          #26.#32        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #32 = NameAndType        #33:#34        // "<init>":(Ljava/lang/String;I)V
  #33 = Utf8               <init>
  #34 = Utf8               (Ljava/lang/String;I)V
  #35 = String             #5             // UNCHANGED
  #36 = Methodref          #1.#32         // ext/mods/gameserver/enums/items/ItemState."<init>":(Ljava/lang/String;I)V
  #37 = String             #9             // ADDED
  #38 = String             #12            // MODIFIED
  #39 = String             #15            // REMOVED
  #40 = Methodref          #1.#41         // ext/mods/gameserver/enums/items/ItemState.$values:()[Lext/mods/gameserver/enums/items/ItemState;
  #41 = NameAndType        #42:#43        // $values:()[Lext/mods/gameserver/enums/items/ItemState;
  #42 = Utf8               $values
  #43 = Utf8               ()[Lext/mods/gameserver/enums/items/ItemState;
  #44 = Utf8               values
  #45 = Utf8               Code
  #46 = Utf8               LineNumberTable
  #47 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/items/ItemState;
  #48 = Utf8               LocalVariableTable
  #49 = Utf8               name
  #50 = Utf8               Ljava/lang/String;
  #51 = Utf8               MethodParameters
  #52 = Utf8               this
  #53 = Utf8               Signature
  #54 = Utf8               ()V
  #55 = Utf8               <clinit>
  #56 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/items/ItemState;>;
  #57 = Utf8               SourceFile
  #58 = Utf8               ItemState.java
{
  public static final ext.mods.gameserver.enums.items.ItemState UNCHANGED;
    descriptor: Lext/mods/gameserver/enums/items/ItemState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ItemState ADDED;
    descriptor: Lext/mods/gameserver/enums/items/ItemState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ItemState MODIFIED;
    descriptor: Lext/mods/gameserver/enums/items/ItemState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.ItemState REMOVED;
    descriptor: Lext/mods/gameserver/enums/items/ItemState;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.items.ItemState[] values();
    descriptor: ()[Lext/mods/gameserver/enums/items/ItemState;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #16                 // Field $VALUES:[Lext/mods/gameserver/enums/items/ItemState;
         3: invokevirtual #20                 // Method "[Lext/mods/gameserver/enums/items/ItemState;".clone:()Ljava/lang/Object;
         6: checkcast     #21                 // class "[Lext/mods/gameserver/enums/items/ItemState;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.items.ItemState valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/items/ItemState;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/items/ItemState
         2: aload_0
         3: invokestatic  #25                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/items/ItemState
         9: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/items/ItemState
         3: dup
         4: ldc           #35                 // String UNCHANGED
         6: iconst_0
         7: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field UNCHANGED:Lext/mods/gameserver/enums/items/ItemState;
        13: new           #1                  // class ext/mods/gameserver/enums/items/ItemState
        16: dup
        17: ldc           #37                 // String ADDED
        19: iconst_1
        20: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field ADDED:Lext/mods/gameserver/enums/items/ItemState;
        26: new           #1                  // class ext/mods/gameserver/enums/items/ItemState
        29: dup
        30: ldc           #38                 // String MODIFIED
        32: iconst_2
        33: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field MODIFIED:Lext/mods/gameserver/enums/items/ItemState;
        39: new           #1                  // class ext/mods/gameserver/enums/items/ItemState
        42: dup
        43: ldc           #39                 // String REMOVED
        45: iconst_3
        46: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field REMOVED:Lext/mods/gameserver/enums/items/ItemState;
        52: invokestatic  #40                 // Method $values:()[Lext/mods/gameserver/enums/items/ItemState;
        55: putstatic     #16                 // Field $VALUES:[Lext/mods/gameserver/enums/items/ItemState;
        58: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 24: 26
        line 25: 39
        line 20: 52
}
Signature: #56                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/items/ItemState;>;
SourceFile: "ItemState.java"
