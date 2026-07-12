// Bytecode for: ext.mods.gameserver.model.actor.instance.Trainer
// File: ext\mods\gameserver\model\actor\instance\Trainer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/Trainer.class
  Last modified 9 de jul de 2026; size 1466 bytes
  MD5 checksum 641731d2bf12b32a66643aebf2a4b5ec
  Compiled from "Trainer.java"
public final class ext.mods.gameserver.model.actor.instance.Trainer extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #19                         // ext/mods/gameserver/model/actor/instance/Trainer
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 0, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #2 = Class              #4             // ext/mods/gameserver/model/actor/instance/Folk
   #3 = NameAndType        #5:#6          // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
   #5 = Utf8               <init>
   #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #7 = String             #8             //
   #8 = Utf8
   #9 = InvokeDynamic      #0:#10         // #0:makeConcatWithConstants:(I)Ljava/lang/String;
  #10 = NameAndType        #11:#12        // makeConcatWithConstants:(I)Ljava/lang/String;
  #11 = Utf8               makeConcatWithConstants
  #12 = Utf8               (I)Ljava/lang/String;
  #13 = InvokeDynamic      #1:#14         // #1:makeConcatWithConstants:(II)Ljava/lang/String;
  #14 = NameAndType        #11:#15        // makeConcatWithConstants:(II)Ljava/lang/String;
  #15 = Utf8               (II)Ljava/lang/String;
  #16 = InvokeDynamic      #2:#17         // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #17 = NameAndType        #11:#18        // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #18 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #19 = Class              #20            // ext/mods/gameserver/model/actor/instance/Trainer
  #20 = Utf8               ext/mods/gameserver/model/actor/instance/Trainer
  #21 = Utf8               Code
  #22 = Utf8               LineNumberTable
  #23 = Utf8               LocalVariableTable
  #24 = Utf8               this
  #25 = Utf8               Lext/mods/gameserver/model/actor/instance/Trainer;
  #26 = Utf8               objectId
  #27 = Utf8               I
  #28 = Utf8               template
  #29 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #30 = Utf8               getHtmlPath
  #31 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
  #32 = Utf8               player
  #33 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #34 = Utf8               npcId
  #35 = Utf8               val
  #36 = Utf8               filename
  #37 = Utf8               Ljava/lang/String;
  #38 = Utf8               StackMapTable
  #39 = Class              #40            // java/lang/String
  #40 = Utf8               java/lang/String
  #41 = Utf8               SourceFile
  #42 = Utf8               Trainer.java
  #43 = Utf8               BootstrapMethods
  #44 = String             #45            // \u0001
  #45 = Utf8               \u0001
  #46 = String             #47            // \u0001-\u0001
  #47 = Utf8               \u0001-\u0001
  #48 = String             #49            // html/trainer/\u0001.htm
  #49 = Utf8               html/trainer/\u0001.htm
  #50 = MethodHandle       6:#51          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #51 = Methodref          #52.#53        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #52 = Class              #54            // java/lang/invoke/StringConcatFactory
  #53 = NameAndType        #11:#55        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #54 = Utf8               java/lang/invoke/StringConcatFactory
  #55 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #56 = Utf8               InnerClasses
  #57 = Class              #58            // java/lang/invoke/MethodHandles$Lookup
  #58 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #59 = Class              #60            // java/lang/invoke/MethodHandles
  #60 = Utf8               java/lang/invoke/MethodHandles
  #61 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.Trainer(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 30: 0
        line 31: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/Trainer;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public java.lang.String getHtmlPath(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=4
         0: ldc           #7                  // String
         2: astore        4
         4: iload_3
         5: ifne          19
         8: iload_2
         9: invokedynamic #9,  0              // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        14: astore        4
        16: goto          28
        19: iload_2
        20: iload_3
        21: invokedynamic #13,  0             // InvokeDynamic #1:makeConcatWithConstants:(II)Ljava/lang/String;
        26: astore        4
        28: aload         4
        30: invokedynamic #16,  0             // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        35: areturn
      LineNumberTable:
        line 36: 0
        line 37: 4
        line 38: 8
        line 40: 19
        line 42: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/actor/instance/Trainer;
            0      36     1 player   Lext/mods/gameserver/model/actor/Player;
            0      36     2 npcId   I
            0      36     3   val   I
            4      32     4 filename   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/lang/String ]
        frame_type = 8 /* same */
}
SourceFile: "Trainer.java"
BootstrapMethods:
  0: #50 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #44 \u0001
  1: #50 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #46 \u0001-\u0001
  2: #50 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #48 html/trainer/\u0001.htm
InnerClasses:
  public static final #61= #57 of #59;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
