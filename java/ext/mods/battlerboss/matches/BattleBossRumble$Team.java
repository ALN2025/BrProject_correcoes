// Bytecode for: ext.mods.battlerboss.matches.BattleBossRumble$Team
// File: ext\mods\battlerboss\matches\BattleBossRumble$Team.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/battlerboss/matches/BattleBossRumble$Team.class
  Last modified 9 de jul de 2026; size 1640 bytes
  MD5 checksum 47629114a349c428d7a1684772d80187
  Compiled from "BattleBossRumble.java"
final class ext.mods.battlerboss.matches.BattleBossRumble$Team
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/battlerboss/matches/BattleBossRumble$Team
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 4, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/battlerboss/matches/BattleBossRumble$Team.members:Ljava/util/List;
   #8 = Class              #10            // ext/mods/battlerboss/matches/BattleBossRumble$Team
   #9 = NameAndType        #11:#12        // members:Ljava/util/List;
  #10 = Utf8               ext/mods/battlerboss/matches/BattleBossRumble$Team
  #11 = Utf8               members
  #12 = Utf8               Ljava/util/List;
  #13 = Methodref          #14.#15        // java/lang/System.identityHashCode:(Ljava/lang/Object;)I
  #14 = Class              #16            // java/lang/System
  #15 = NameAndType        #17:#18        // identityHashCode:(Ljava/lang/Object;)I
  #16 = Utf8               java/lang/System
  #17 = Utf8               identityHashCode
  #18 = Utf8               (Ljava/lang/Object;)I
  #19 = InterfaceMethodref #20.#21        // java/util/List.size:()I
  #20 = Class              #22            // java/util/List
  #21 = NameAndType        #23:#24        // size:()I
  #22 = Utf8               java/util/List
  #23 = Utf8               size
  #24 = Utf8               ()I
  #25 = InvokeDynamic      #0:#26         // #0:makeConcatWithConstants:(II)Ljava/lang/String;
  #26 = NameAndType        #27:#28        // makeConcatWithConstants:(II)Ljava/lang/String;
  #27 = Utf8               makeConcatWithConstants
  #28 = Utf8               (II)Ljava/lang/String;
  #29 = Utf8               Signature
  #30 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #31 = Utf8               (Ljava/util/List;)V
  #32 = Utf8               Code
  #33 = Utf8               LineNumberTable
  #34 = Utf8               LocalVariableTable
  #35 = Utf8               this
  #36 = Utf8               Lext/mods/battlerboss/matches/BattleBossRumble$Team;
  #37 = Utf8               LocalVariableTypeTable
  #38 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;)V
  #39 = Utf8               hashCode
  #40 = Utf8               equals
  #41 = Utf8               (Ljava/lang/Object;)Z
  #42 = Utf8               o
  #43 = Utf8               Ljava/lang/Object;
  #44 = Utf8               StackMapTable
  #45 = Utf8               toString
  #46 = Utf8               ()Ljava/lang/String;
  #47 = Utf8               SourceFile
  #48 = Utf8               BattleBossRumble.java
  #49 = Utf8               NestHost
  #50 = Class              #51            // ext/mods/battlerboss/matches/BattleBossRumble
  #51 = Utf8               ext/mods/battlerboss/matches/BattleBossRumble
  #52 = Utf8               BootstrapMethods
  #53 = String             #54            // Team@\u0001 size=\u0001
  #54 = Utf8               Team@\u0001 size=\u0001
  #55 = MethodHandle       6:#56          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #56 = Methodref          #57.#58        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #57 = Class              #59            // java/lang/invoke/StringConcatFactory
  #58 = NameAndType        #27:#60        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #59 = Utf8               java/lang/invoke/StringConcatFactory
  #60 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #61 = Utf8               InnerClasses
  #62 = Utf8               Team
  #63 = Class              #64            // java/lang/invoke/MethodHandles$Lookup
  #64 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #65 = Class              #66            // java/lang/invoke/MethodHandles
  #66 = Utf8               java/lang/invoke/MethodHandles
  #67 = Utf8               Lookup
{
  final java.util.List<ext.mods.gameserver.model.actor.Player> members;
    descriptor: Ljava/util/List;
    flags: (0x0010) ACC_FINAL
    Signature: #30                          // Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;

  ext.mods.battlerboss.matches.BattleBossRumble$Team(java.util.List<ext.mods.gameserver.model.actor.Player>);
    descriptor: (Ljava/util/List;)V
    flags: (0x0000)
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field members:Ljava/util/List;
         9: return
      LineNumberTable:
        line 74: 0
        line 75: 4
        line 76: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/battlerboss/matches/BattleBossRumble$Team;
            0      10     1 members   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     1 members   Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
    Signature: #38                          // (Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;)V

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field members:Ljava/util/List;
         4: invokestatic  #13                 // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I
         7: ireturn
      LineNumberTable:
        line 81: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/battlerboss/matches/BattleBossRumble$Team;

  public boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: instanceof    #8                  // class ext/mods/battlerboss/matches/BattleBossRumble$Team
         4: ifeq          25
         7: aload_1
         8: checkcast     #8                  // class ext/mods/battlerboss/matches/BattleBossRumble$Team
        11: getfield      #7                  // Field members:Ljava/util/List;
        14: aload_0
        15: getfield      #7                  // Field members:Ljava/util/List;
        18: if_acmpne     25
        21: iconst_1
        22: goto          26
        25: iconst_0
        26: ireturn
      LineNumberTable:
        line 87: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/battlerboss/matches/BattleBossRumble$Team;
            0      27     1     o   Ljava/lang/Object;
      StackMapTable: number_of_entries = 2
        frame_type = 25 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field members:Ljava/util/List;
         4: invokestatic  #13                 // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I
         7: aload_0
         8: getfield      #7                  // Field members:Ljava/util/List;
        11: invokeinterface #19,  1           // InterfaceMethod java/util/List.size:()I
        16: invokedynamic #25,  0             // InvokeDynamic #0:makeConcatWithConstants:(II)Ljava/lang/String;
        21: areturn
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/battlerboss/matches/BattleBossRumble$Team;
}
SourceFile: "BattleBossRumble.java"
NestHost: class ext/mods/battlerboss/matches/BattleBossRumble
BootstrapMethods:
  0: #55 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #53 Team@\u0001 size=\u0001
InnerClasses:
  public static final #67= #63 of #65;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
