// Bytecode for: ext.mods.gameserver.model.Macro
// File: ext\mods\gameserver\model\Macro.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/Macro.class
  Last modified 9 de jul de 2026; size 1696 bytes
  MD5 checksum 886884b2d53a2aff94966485e9eb6751
  Compiled from "Macro.java"
public class ext.mods.gameserver.model.Macro
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/Macro
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 9, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/Macro.id:I
   #8 = Class              #10            // ext/mods/gameserver/model/Macro
   #9 = NameAndType        #11:#12        // id:I
  #10 = Utf8               ext/mods/gameserver/model/Macro
  #11 = Utf8               id
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/Macro.icon:I
  #14 = NameAndType        #15:#12        // icon:I
  #15 = Utf8               icon
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/Macro.name:Ljava/lang/String;
  #17 = NameAndType        #18:#19        // name:Ljava/lang/String;
  #18 = Utf8               name
  #19 = Utf8               Ljava/lang/String;
  #20 = Fieldref           #8.#21         // ext/mods/gameserver/model/Macro.descr:Ljava/lang/String;
  #21 = NameAndType        #22:#19        // descr:Ljava/lang/String;
  #22 = Utf8               descr
  #23 = Fieldref           #8.#24         // ext/mods/gameserver/model/Macro.acronym:Ljava/lang/String;
  #24 = NameAndType        #25:#19        // acronym:Ljava/lang/String;
  #25 = Utf8               acronym
  #26 = Fieldref           #8.#27         // ext/mods/gameserver/model/Macro.commands:[Lext/mods/gameserver/model/records/MacroCmd;
  #27 = NameAndType        #28:#29        // commands:[Lext/mods/gameserver/model/records/MacroCmd;
  #28 = Utf8               commands
  #29 = Utf8               [Lext/mods/gameserver/model/records/MacroCmd;
  #30 = Methodref          #31.#32        // java/util/Arrays.toString:([Ljava/lang/Object;)Ljava/lang/String;
  #31 = Class              #33            // java/util/Arrays
  #32 = NameAndType        #34:#35        // toString:([Ljava/lang/Object;)Ljava/lang/String;
  #33 = Utf8               java/util/Arrays
  #34 = Utf8               toString
  #35 = Utf8               ([Ljava/lang/Object;)Ljava/lang/String;
  #36 = InvokeDynamic      #0:#37         // #0:makeConcatWithConstants:(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #37 = NameAndType        #38:#39        // makeConcatWithConstants:(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #38 = Utf8               makeConcatWithConstants
  #39 = Utf8               (IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #40 = Utf8               CMD_TYPE_SKILL
  #41 = Utf8               ConstantValue
  #42 = Integer            1
  #43 = Utf8               CMD_TYPE_ACTION
  #44 = Integer            3
  #45 = Utf8               CMD_TYPE_SHORTCUT
  #46 = Integer            4
  #47 = Utf8               (IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lext/mods/gameserver/model/records/MacroCmd;)V
  #48 = Utf8               Code
  #49 = Utf8               LineNumberTable
  #50 = Utf8               LocalVariableTable
  #51 = Utf8               this
  #52 = Utf8               Lext/mods/gameserver/model/Macro;
  #53 = Utf8               pId
  #54 = Utf8               pIcon
  #55 = Utf8               pName
  #56 = Utf8               pDescr
  #57 = Utf8               pAcronym
  #58 = Utf8               pCommands
  #59 = Utf8               ()Ljava/lang/String;
  #60 = Utf8               SourceFile
  #61 = Utf8               Macro.java
  #62 = Utf8               BootstrapMethods
  #63 = String             #64            // Macro [id=\u0001, icon=\u0001, name=\u0001, descr=\u0001, acronym=\u0001, commands=\u0001]
  #64 = Utf8               Macro [id=\u0001, icon=\u0001, name=\u0001, descr=\u0001, acronym=\u0001, commands=\u0001]
  #65 = MethodHandle       6:#66          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #66 = Methodref          #67.#68        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #67 = Class              #69            // java/lang/invoke/StringConcatFactory
  #68 = NameAndType        #38:#70        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #69 = Utf8               java/lang/invoke/StringConcatFactory
  #70 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #71 = Utf8               InnerClasses
  #72 = Class              #73            // java/lang/invoke/MethodHandles$Lookup
  #73 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #74 = Class              #75            // java/lang/invoke/MethodHandles
  #75 = Utf8               java/lang/invoke/MethodHandles
  #76 = Utf8               Lookup
{
  public static final int CMD_TYPE_SKILL;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final int CMD_TYPE_ACTION;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 3

  public static final int CMD_TYPE_SHORTCUT;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 4

  public int id;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public final int icon;
    descriptor: I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final java.lang.String name;
    descriptor: Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final java.lang.String descr;
    descriptor: Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final java.lang.String acronym;
    descriptor: Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public final ext.mods.gameserver.model.records.MacroCmd[] commands;
    descriptor: [Lext/mods/gameserver/model/records/MacroCmd;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL

  public ext.mods.gameserver.model.Macro(int, int, java.lang.String, java.lang.String, java.lang.String, ext.mods.gameserver.model.records.MacroCmd[]);
    descriptor: (IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lext/mods/gameserver/model/records/MacroCmd;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=7, args_size=7
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field id:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field icon:I
        14: aload_0
        15: aload_3
        16: putfield      #16                 // Field name:Ljava/lang/String;
        19: aload_0
        20: aload         4
        22: putfield      #20                 // Field descr:Ljava/lang/String;
        25: aload_0
        26: aload         5
        28: putfield      #23                 // Field acronym:Ljava/lang/String;
        31: aload_0
        32: aload         6
        34: putfield      #26                 // Field commands:[Lext/mods/gameserver/model/records/MacroCmd;
        37: return
      LineNumberTable:
        line 41: 0
        line 42: 4
        line 43: 9
        line 44: 14
        line 45: 19
        line 46: 25
        line 47: 31
        line 48: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/Macro;
            0      38     1   pId   I
            0      38     2 pIcon   I
            0      38     3 pName   Ljava/lang/String;
            0      38     4 pDescr   Ljava/lang/String;
            0      38     5 pAcronym   Ljava/lang/String;
            0      38     6 pCommands   [Lext/mods/gameserver/model/records/MacroCmd;

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field id:I
         4: aload_0
         5: getfield      #13                 // Field icon:I
         8: aload_0
         9: getfield      #16                 // Field name:Ljava/lang/String;
        12: aload_0
        13: getfield      #20                 // Field descr:Ljava/lang/String;
        16: aload_0
        17: getfield      #23                 // Field acronym:Ljava/lang/String;
        20: aload_0
        21: getfield      #26                 // Field commands:[Lext/mods/gameserver/model/records/MacroCmd;
        24: invokestatic  #30                 // Method java/util/Arrays.toString:([Ljava/lang/Object;)Ljava/lang/String;
        27: invokedynamic #36,  0             // InvokeDynamic #0:makeConcatWithConstants:(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        32: areturn
      LineNumberTable:
        line 53: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/Macro;
}
SourceFile: "Macro.java"
BootstrapMethods:
  0: #65 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #63 Macro [id=\u0001, icon=\u0001, name=\u0001, descr=\u0001, acronym=\u0001, commands=\u0001]
InnerClasses:
  public static final #76= #72 of #74;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
