// Bytecode for: ext.mods.gameserver.data.SkillTable
// File: ext\mods\gameserver\data\SkillTable.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/SkillTable.class
  Last modified 9 de jul de 2026; size 5815 bytes
  MD5 checksum 6967fcd55c232415f09dcb5c0e38a883
  Compiled from "SkillTable.java"
public class ext.mods.gameserver.data.SkillTable
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/data/SkillTable
  super_class: #8                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 15, attributes: 4
Constant pool:
    #1 = Fieldref           #2.#3         // ext/mods/gameserver/data/SkillTable$SingletonHolder._instance:Lext/mods/gameserver/data/SkillTable;
    #2 = Class              #4            // ext/mods/gameserver/data/SkillTable$SingletonHolder
    #3 = NameAndType        #5:#6         // _instance:Lext/mods/gameserver/data/SkillTable;
    #4 = Utf8               ext/mods/gameserver/data/SkillTable$SingletonHolder
    #5 = Utf8               _instance
    #6 = Utf8               Lext/mods/gameserver/data/SkillTable;
    #7 = Methodref          #8.#9         // java/lang/Object."<init>":()V
    #8 = Class              #10           // java/lang/Object
    #9 = NameAndType        #11:#12       // "<init>":()V
   #10 = Utf8               java/lang/Object
   #11 = Utf8               <init>
   #12 = Utf8               ()V
   #13 = Methodref          #14.#15       // ext/mods/gameserver/data/SkillTable.load:()V
   #14 = Class              #16           // ext/mods/gameserver/data/SkillTable
   #15 = NameAndType        #17:#12       // load:()V
   #16 = Utf8               ext/mods/gameserver/data/SkillTable
   #17 = Utf8               load
   #18 = Fieldref           #19.#20       // ext/mods/Config.DATA_PATH:Ljava/nio/file/Path;
   #19 = Class              #21           // ext/mods/Config
   #20 = NameAndType        #22:#23       // DATA_PATH:Ljava/nio/file/Path;
   #21 = Utf8               ext/mods/Config
   #22 = Utf8               DATA_PATH
   #23 = Utf8               Ljava/nio/file/Path;
   #24 = String             #25           // xml
   #25 = Utf8               xml
   #26 = InterfaceMethodref #27.#28       // java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
   #27 = Class              #29           // java/nio/file/Path
   #28 = NameAndType        #30:#31       // resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
   #29 = Utf8               java/nio/file/Path
   #30 = Utf8               resolve
   #31 = Utf8               (Ljava/lang/String;)Ljava/nio/file/Path;
   #32 = String             #33           // skills
   #33 = Utf8               skills
   #34 = InterfaceMethodref #27.#35       // java/nio/file/Path.toFile:()Ljava/io/File;
   #35 = NameAndType        #36:#37       // toFile:()Ljava/io/File;
   #36 = Utf8               toFile
   #37 = Utf8               ()Ljava/io/File;
   #38 = Methodref          #39.#40       // java/io/File.listFiles:()[Ljava/io/File;
   #39 = Class              #41           // java/io/File
   #40 = NameAndType        #42:#43       // listFiles:()[Ljava/io/File;
   #41 = Utf8               java/io/File
   #42 = Utf8               listFiles
   #43 = Utf8               ()[Ljava/io/File;
   #44 = Class              #45           // ext/mods/gameserver/data/DocumentSkill
   #45 = Utf8               ext/mods/gameserver/data/DocumentSkill
   #46 = Methodref          #44.#47       // ext/mods/gameserver/data/DocumentSkill."<init>":(Ljava/io/File;)V
   #47 = NameAndType        #11:#48       // "<init>":(Ljava/io/File;)V
   #48 = Utf8               (Ljava/io/File;)V
   #49 = Methodref          #44.#50       // ext/mods/gameserver/data/DocumentSkill.parse:()Lorg/w3c/dom/Document;
   #50 = NameAndType        #51:#52       // parse:()Lorg/w3c/dom/Document;
   #51 = Utf8               parse
   #52 = Utf8               ()Lorg/w3c/dom/Document;
   #53 = Methodref          #44.#54       // ext/mods/gameserver/data/DocumentSkill.getSkills:()Ljava/util/List;
   #54 = NameAndType        #55:#56       // getSkills:()Ljava/util/List;
   #55 = Utf8               getSkills
   #56 = Utf8               ()Ljava/util/List;
   #57 = InterfaceMethodref #58.#59       // java/util/List.iterator:()Ljava/util/Iterator;
   #58 = Class              #60           // java/util/List
   #59 = NameAndType        #61:#62       // iterator:()Ljava/util/Iterator;
   #60 = Utf8               java/util/List
   #61 = Utf8               iterator
   #62 = Utf8               ()Ljava/util/Iterator;
   #63 = InterfaceMethodref #64.#65       // java/util/Iterator.hasNext:()Z
   #64 = Class              #66           // java/util/Iterator
   #65 = NameAndType        #67:#68       // hasNext:()Z
   #66 = Utf8               java/util/Iterator
   #67 = Utf8               hasNext
   #68 = Utf8               ()Z
   #69 = InterfaceMethodref #64.#70       // java/util/Iterator.next:()Ljava/lang/Object;
   #70 = NameAndType        #71:#72       // next:()Ljava/lang/Object;
   #71 = Utf8               next
   #72 = Utf8               ()Ljava/lang/Object;
   #73 = Class              #74           // ext/mods/gameserver/skills/L2Skill
   #74 = Utf8               ext/mods/gameserver/skills/L2Skill
   #75 = Fieldref           #14.#76       // ext/mods/gameserver/data/SkillTable._skills:Ljava/util/Map;
   #76 = NameAndType        #77:#78       // _skills:Ljava/util/Map;
   #77 = Utf8               _skills
   #78 = Utf8               Ljava/util/Map;
   #79 = Methodref          #14.#80       // ext/mods/gameserver/data/SkillTable.getSkillHashCode:(Lext/mods/gameserver/skills/L2Skill;)I
   #80 = NameAndType        #81:#82       // getSkillHashCode:(Lext/mods/gameserver/skills/L2Skill;)I
   #81 = Utf8               getSkillHashCode
   #82 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)I
   #83 = Methodref          #84.#85       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #84 = Class              #86           // java/lang/Integer
   #85 = NameAndType        #87:#88       // valueOf:(I)Ljava/lang/Integer;
   #86 = Utf8               java/lang/Integer
   #87 = Utf8               valueOf
   #88 = Utf8               (I)Ljava/lang/Integer;
   #89 = InterfaceMethodref #90.#91       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #90 = Class              #92           // java/util/Map
   #91 = NameAndType        #93:#94       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #92 = Utf8               java/util/Map
   #93 = Utf8               put
   #94 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #95 = Fieldref           #14.#96       // ext/mods/gameserver/data/SkillTable._log:Ljava/util/logging/Logger;
   #96 = NameAndType        #97:#98       // _log:Ljava/util/logging/Logger;
   #97 = Utf8               _log
   #98 = Utf8               Ljava/util/logging/Logger;
   #99 = InterfaceMethodref #90.#100      // java/util/Map.size:()I
  #100 = NameAndType        #101:#102     // size:()I
  #101 = Utf8               size
  #102 = Utf8               ()I
  #103 = InvokeDynamic      #0:#104       // #0:makeConcatWithConstants:(I)Ljava/lang/String;
  #104 = NameAndType        #105:#106     // makeConcatWithConstants:(I)Ljava/lang/String;
  #105 = Utf8               makeConcatWithConstants
  #106 = Utf8               (I)Ljava/lang/String;
  #107 = Methodref          #108.#109     // java/util/logging/Logger.info:(Ljava/lang/String;)V
  #108 = Class              #110          // java/util/logging/Logger
  #109 = NameAndType        #111:#112     // info:(Ljava/lang/String;)V
  #110 = Utf8               java/util/logging/Logger
  #111 = Utf8               info
  #112 = Utf8               (Ljava/lang/String;)V
  #113 = InterfaceMethodref #90.#114      // java/util/Map.values:()Ljava/util/Collection;
  #114 = NameAndType        #115:#116     // values:()Ljava/util/Collection;
  #115 = Utf8               values
  #116 = Utf8               ()Ljava/util/Collection;
  #117 = InterfaceMethodref #118.#59      // java/util/Collection.iterator:()Ljava/util/Iterator;
  #118 = Class              #119          // java/util/Collection
  #119 = Utf8               java/util/Collection
  #120 = Methodref          #73.#121      // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #121 = NameAndType        #122:#102     // getLevel:()I
  #122 = Utf8               getLevel
  #123 = Methodref          #73.#124      // ext/mods/gameserver/skills/L2Skill.getId:()I
  #124 = NameAndType        #125:#102     // getId:()I
  #125 = Utf8               getId
  #126 = Methodref          #14.#127      // ext/mods/gameserver/data/SkillTable.getMaxLevel:(I)I
  #127 = NameAndType        #128:#129     // getMaxLevel:(I)I
  #128 = Utf8               getMaxLevel
  #129 = Utf8               (I)I
  #130 = Fieldref           #14.#131      // ext/mods/gameserver/data/SkillTable._skillMaxLevel:Ljava/util/Map;
  #131 = NameAndType        #132:#78      // _skillMaxLevel:Ljava/util/Map;
  #132 = Utf8               _skillMaxLevel
  #133 = Methodref          #134.#135     // ext/mods/gameserver/data/SkillTable$FrequentSkill.values:()[Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #134 = Class              #136          // ext/mods/gameserver/data/SkillTable$FrequentSkill
  #135 = NameAndType        #115:#137     // values:()[Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #136 = Utf8               ext/mods/gameserver/data/SkillTable$FrequentSkill
  #137 = Utf8               ()[Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #138 = Fieldref           #134.#139     // ext/mods/gameserver/data/SkillTable$FrequentSkill._id:I
  #139 = NameAndType        #140:#141     // _id:I
  #140 = Utf8               _id
  #141 = Utf8               I
  #142 = Fieldref           #134.#143     // ext/mods/gameserver/data/SkillTable$FrequentSkill._level:I
  #143 = NameAndType        #144:#141     // _level:I
  #144 = Utf8               _level
  #145 = Methodref          #14.#146      // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #146 = NameAndType        #147:#148     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #147 = Utf8               getInfo
  #148 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #149 = Fieldref           #134.#150     // ext/mods/gameserver/data/SkillTable$FrequentSkill._skill:Lext/mods/gameserver/skills/L2Skill;
  #150 = NameAndType        #151:#152     // _skill:Lext/mods/gameserver/skills/L2Skill;
  #151 = Utf8               _skill
  #152 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #153 = Fieldref           #14.#154      // ext/mods/gameserver/data/SkillTable._heroSkillsId:[I
  #154 = NameAndType        #155:#156     // _heroSkillsId:[I
  #155 = Utf8               _heroSkillsId
  #156 = Utf8               [I
  #157 = Fieldref           #14.#158      // ext/mods/gameserver/data/SkillTable._heroSkills:[Lext/mods/gameserver/skills/L2Skill;
  #158 = NameAndType        #159:#160     // _heroSkills:[Lext/mods/gameserver/skills/L2Skill;
  #159 = Utf8               _heroSkills
  #160 = Utf8               [Lext/mods/gameserver/skills/L2Skill;
  #161 = Fieldref           #14.#162      // ext/mods/gameserver/data/SkillTable._nobleSkills:[Lext/mods/gameserver/skills/L2Skill;
  #162 = NameAndType        #163:#160     // _nobleSkills:[Lext/mods/gameserver/skills/L2Skill;
  #163 = Utf8               _nobleSkills
  #164 = Fieldref           #14.#165      // ext/mods/gameserver/data/SkillTable._nobleSkillsId:[I
  #165 = NameAndType        #166:#156     // _nobleSkillsId:[I
  #166 = Utf8               _nobleSkillsId
  #167 = Fieldref           #14.#168      // ext/mods/gameserver/data/SkillTable._clanSkills:[Lext/mods/gameserver/skills/L2Skill;
  #168 = NameAndType        #169:#160     // _clanSkills:[Lext/mods/gameserver/skills/L2Skill;
  #169 = Utf8               _clanSkills
  #170 = InterfaceMethodref #90.#171      // java/util/Map.clear:()V
  #171 = NameAndType        #172:#12      // clear:()V
  #172 = Utf8               clear
  #173 = Methodref          #14.#174      // ext/mods/gameserver/data/SkillTable.getSkillHashCode:(II)I
  #174 = NameAndType        #81:#175      // getSkillHashCode:(II)I
  #175 = Utf8               (II)I
  #176 = InterfaceMethodref #90.#177      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #177 = NameAndType        #178:#179     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #178 = Utf8               get
  #179 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #180 = InterfaceMethodref #90.#181      // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #181 = NameAndType        #182:#94      // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #182 = Utf8               getOrDefault
  #183 = Methodref          #84.#184      // java/lang/Integer.intValue:()I
  #184 = NameAndType        #185:#102     // intValue:()I
  #185 = Utf8               intValue
  #186 = Methodref          #187.#188     // java/lang/Class.getName:()Ljava/lang/String;
  #187 = Class              #189          // java/lang/Class
  #188 = NameAndType        #190:#191     // getName:()Ljava/lang/String;
  #189 = Utf8               java/lang/Class
  #190 = Utf8               getName
  #191 = Utf8               ()Ljava/lang/String;
  #192 = Methodref          #108.#193     // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #193 = NameAndType        #194:#195     // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #194 = Utf8               getLogger
  #195 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
  #196 = Class              #197          // java/util/HashMap
  #197 = Utf8               java/util/HashMap
  #198 = Methodref          #196.#9       // java/util/HashMap."<init>":()V
  #199 = Utf8               Signature
  #200 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/skills/L2Skill;>;
  #201 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #202 = Utf8               getInstance
  #203 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #204 = Utf8               Code
  #205 = Utf8               LineNumberTable
  #206 = Utf8               LocalVariableTable
  #207 = Utf8               this
  #208 = Utf8               skill
  #209 = Utf8               doc
  #210 = Utf8               Lext/mods/gameserver/data/DocumentSkill;
  #211 = Utf8               file
  #212 = Utf8               Ljava/io/File;
  #213 = Utf8               skillId
  #214 = Utf8               maxLvl
  #215 = Utf8               skillLvl
  #216 = Utf8               sk
  #217 = Utf8               Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #218 = Utf8               i
  #219 = Utf8               dir
  #220 = Utf8               StackMapTable
  #221 = Class              #222          // "[Ljava/io/File;"
  #222 = Utf8               [Ljava/io/File;
  #223 = Class              #224          // "[Lext/mods/gameserver/data/SkillTable$FrequentSkill;"
  #224 = Utf8               [Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #225 = Utf8               reload
  #226 = Utf8               ()Ljava/util/Collection<Lext/mods/gameserver/skills/L2Skill;>;
  #227 = Utf8               skillLevel
  #228 = Utf8               level
  #229 = Utf8               getSiegeSkills
  #230 = Utf8               (Z)[Lext/mods/gameserver/skills/L2Skill;
  #231 = Utf8               addNoble
  #232 = Utf8               Z
  #233 = Utf8               temp
  #234 = Class              #160          // "[Lext/mods/gameserver/skills/L2Skill;"
  #235 = Utf8               getHeroSkills
  #236 = Utf8               ()[Lext/mods/gameserver/skills/L2Skill;
  #237 = Utf8               isHeroSkill
  #238 = Utf8               (I)Z
  #239 = Utf8               id
  #240 = Utf8               skillid
  #241 = Class              #156          // "[I"
  #242 = Utf8               getNobleSkills
  #243 = Utf8               getClanSkills
  #244 = Utf8               <clinit>
  #245 = Utf8               SourceFile
  #246 = Utf8               SkillTable.java
  #247 = Utf8               NestMembers
  #248 = Utf8               BootstrapMethods
  #249 = String             #250          // SkillTable: Loaded \u0001 skills.
  #250 = Utf8               SkillTable: Loaded \u0001 skills.
  #251 = MethodHandle       6:#252        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #252 = Methodref          #253.#254     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #253 = Class              #255          // java/lang/invoke/StringConcatFactory
  #254 = NameAndType        #105:#256     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #255 = Utf8               java/lang/invoke/StringConcatFactory
  #256 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #257 = Utf8               InnerClasses
  #258 = Utf8               SingletonHolder
  #259 = Utf8               FrequentSkill
  #260 = Class              #261          // java/lang/invoke/MethodHandles$Lookup
  #261 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #262 = Class              #263          // java/lang/invoke/MethodHandles
  #263 = Utf8               java/lang/invoke/MethodHandles
  #264 = Utf8               Lookup
{
  public static ext.mods.gameserver.data.SkillTable getInstance();
    descriptor: ()Lext/mods/gameserver/data/SkillTable;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #1                  // Field ext/mods/gameserver/data/SkillTable$SingletonHolder._instance:Lext/mods/gameserver/data/SkillTable;
         3: areturn
      LineNumberTable:
        line 69: 0

  protected ext.mods.gameserver.data.SkillTable();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #7                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: invokevirtual #13                 // Method load:()V
         8: return
      LineNumberTable:
        line 73: 0
        line 74: 4
        line 75: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/data/SkillTable;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #75                 // Field _skills:Ljava/util/Map;
         3: invokeinterface #170,  1          // InterfaceMethod java/util/Map.clear:()V
         8: getstatic     #130                // Field _skillMaxLevel:Ljava/util/Map;
        11: invokeinterface #170,  1          // InterfaceMethod java/util/Map.clear:()V
        16: aload_0
        17: invokevirtual #13                 // Method load:()V
        20: return
      LineNumberTable:
        line 151: 0
        line 152: 8
        line 154: 16
        line 155: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/data/SkillTable;

  public java.util.Collection<ext.mods.gameserver.skills.L2Skill> getSkills();
    descriptor: ()Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #75                 // Field _skills:Ljava/util/Map;
         3: invokeinterface #113,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         8: areturn
      LineNumberTable:
        line 159: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/data/SkillTable;
    Signature: #226                         // ()Ljava/util/Collection<Lext/mods/gameserver/skills/L2Skill;>;

  public static int getSkillHashCode(ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;)I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #123                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
         4: aload_0
         5: invokevirtual #120                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
         8: invokestatic  #173                // Method getSkillHashCode:(II)I
        11: ireturn
      LineNumberTable:
        line 169: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0 skill   Lext/mods/gameserver/skills/L2Skill;

  public static int getSkillHashCode(int, int);
    descriptor: (II)I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=2
         0: iload_0
         1: sipush        256
         4: imul
         5: iload_1
         6: iadd
         7: ireturn
      LineNumberTable:
        line 180: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0 skillId   I
            0       8     1 skillLevel   I

  public ext.mods.gameserver.skills.L2Skill getInfo(int, int);
    descriptor: (II)Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: getstatic     #75                 // Field _skills:Ljava/util/Map;
         3: iload_1
         4: iload_2
         5: invokestatic  #173                // Method getSkillHashCode:(II)I
         8: invokestatic  #83                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: invokeinterface #176,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        16: checkcast     #73                 // class ext/mods/gameserver/skills/L2Skill
        19: areturn
      LineNumberTable:
        line 185: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/SkillTable;
            0      20     1 skillId   I
            0      20     2 level   I

  public int getMaxLevel(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: getstatic     #130                // Field _skillMaxLevel:Ljava/util/Map;
         3: iload_1
         4: invokestatic  #83                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         7: iconst_0
         8: invokestatic  #83                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: invokeinterface #180,  3          // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        16: checkcast     #84                 // class java/lang/Integer
        19: invokevirtual #183                // Method java/lang/Integer.intValue:()I
        22: ireturn
      LineNumberTable:
        line 190: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/data/SkillTable;
            0      23     1 skillId   I

  public ext.mods.gameserver.skills.L2Skill[] getSiegeSkills(boolean);
    descriptor: (Z)[Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=2
         0: iconst_2
         1: iload_1
         2: ifeq          9
         5: iconst_1
         6: goto          10
         9: iconst_0
        10: iadd
        11: anewarray     #73                 // class ext/mods/gameserver/skills/L2Skill
        14: astore_2
        15: iconst_0
        16: istore_3
        17: aload_2
        18: iload_3
        19: iinc          3, 1
        22: getstatic     #75                 // Field _skills:Ljava/util/Map;
        25: sipush        246
        28: iconst_1
        29: invokestatic  #173                // Method getSkillHashCode:(II)I
        32: invokestatic  #83                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        35: invokeinterface #176,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        40: checkcast     #73                 // class ext/mods/gameserver/skills/L2Skill
        43: aastore
        44: aload_2
        45: iload_3
        46: iinc          3, 1
        49: getstatic     #75                 // Field _skills:Ljava/util/Map;
        52: sipush        247
        55: iconst_1
        56: invokestatic  #173                // Method getSkillHashCode:(II)I
        59: invokestatic  #83                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        62: invokeinterface #176,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        67: checkcast     #73                 // class ext/mods/gameserver/skills/L2Skill
        70: aastore
        71: iload_1
        72: ifeq          102
        75: aload_2
        76: iload_3
        77: iinc          3, 1
        80: getstatic     #75                 // Field _skills:Ljava/util/Map;
        83: sipush        326
        86: iconst_1
        87: invokestatic  #173                // Method getSkillHashCode:(II)I
        90: invokestatic  #83                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        93: invokeinterface #176,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        98: checkcast     #73                 // class ext/mods/gameserver/skills/L2Skill
       101: aastore
       102: aload_2
       103: areturn
      LineNumberTable:
        line 199: 0
        line 200: 15
        line 202: 17
        line 203: 44
        line 205: 71
        line 206: 75
        line 208: 102
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     104     0  this   Lext/mods/gameserver/data/SkillTable;
            0     104     1 addNoble   Z
           15      89     2  temp   [Lext/mods/gameserver/skills/L2Skill;
           17      87     3     i   I
      StackMapTable: number_of_entries = 3
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/data/SkillTable, int ]
          stack = [ int, int ]
        frame_type = 253 /* append */
          offset_delta = 91
          locals = [ class "[Lext/mods/gameserver/skills/L2Skill;", int ]

  public static ext.mods.gameserver.skills.L2Skill[] getHeroSkills();
    descriptor: ()[Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #157                // Field _heroSkills:[Lext/mods/gameserver/skills/L2Skill;
         3: areturn
      LineNumberTable:
        line 213: 0

  public static boolean isHeroSkill(int);
    descriptor: (I)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=5, args_size=1
         0: getstatic     #153                // Field _heroSkillsId:[I
         3: astore_1
         4: aload_1
         5: arraylength
         6: istore_2
         7: iconst_0
         8: istore_3
         9: iload_3
        10: iload_2
        11: if_icmpge     33
        14: aload_1
        15: iload_3
        16: iaload
        17: istore        4
        19: iload         4
        21: iload_0
        22: if_icmpne     27
        25: iconst_1
        26: ireturn
        27: iinc          3, 1
        30: goto          9
        33: iconst_0
        34: ireturn
      LineNumberTable:
        line 218: 0
        line 219: 19
        line 220: 25
        line 218: 27
        line 222: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19       8     4    id   I
            0      35     0 skillid   I
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 9
          locals = [ class "[I", int, int ]
        frame_type = 17 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public static ext.mods.gameserver.skills.L2Skill[] getNobleSkills();
    descriptor: ()[Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #161                // Field _nobleSkills:[Lext/mods/gameserver/skills/L2Skill;
         3: areturn
      LineNumberTable:
        line 227: 0

  public static ext.mods.gameserver.skills.L2Skill[] getClanSkills();
    descriptor: ()[Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #167                // Field _clanSkills:[Lext/mods/gameserver/skills/L2Skill;
         3: areturn
      LineNumberTable:
        line 232: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: ldc           #14                 // class ext/mods/gameserver/data/SkillTable
         2: invokevirtual #186                // Method java/lang/Class.getName:()Ljava/lang/String;
         5: invokestatic  #192                // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         8: putstatic     #95                 // Field _log:Ljava/util/logging/Logger;
        11: new           #196                // class java/util/HashMap
        14: dup
        15: invokespecial #198                // Method java/util/HashMap."<init>":()V
        18: putstatic     #75                 // Field _skills:Ljava/util/Map;
        21: new           #196                // class java/util/HashMap
        24: dup
        25: invokespecial #198                // Method java/util/HashMap."<init>":()V
        28: putstatic     #130                // Field _skillMaxLevel:Ljava/util/Map;
        31: iconst_5
        32: anewarray     #73                 // class ext/mods/gameserver/skills/L2Skill
        35: putstatic     #157                // Field _heroSkills:[Lext/mods/gameserver/skills/L2Skill;
        38: iconst_5
        39: newarray       int
        41: dup
        42: iconst_0
        43: sipush        395
        46: iastore
        47: dup
        48: iconst_1
        49: sipush        396
        52: iastore
        53: dup
        54: iconst_2
        55: sipush        1374
        58: iastore
        59: dup
        60: iconst_3
        61: sipush        1375
        64: iastore
        65: dup
        66: iconst_4
        67: sipush        1376
        70: iastore
        71: putstatic     #153                // Field _heroSkillsId:[I
        74: bipush        8
        76: anewarray     #73                 // class ext/mods/gameserver/skills/L2Skill
        79: putstatic     #161                // Field _nobleSkills:[Lext/mods/gameserver/skills/L2Skill;
        82: bipush        8
        84: newarray       int
        86: dup
        87: iconst_0
        88: sipush        325
        91: iastore
        92: dup
        93: iconst_1
        94: sipush        326
        97: iastore
        98: dup
        99: iconst_2
       100: sipush        327
       103: iastore
       104: dup
       105: iconst_3
       106: sipush        1323
       109: iastore
       110: dup
       111: iconst_4
       112: sipush        1324
       115: iastore
       116: dup
       117: iconst_5
       118: sipush        1325
       121: iastore
       122: dup
       123: bipush        6
       125: sipush        1326
       128: iastore
       129: dup
       130: bipush        7
       132: sipush        1327
       135: iastore
       136: putstatic     #164                // Field _nobleSkillsId:[I
       139: bipush        22
       141: anewarray     #73                 // class ext/mods/gameserver/skills/L2Skill
       144: putstatic     #167                // Field _clanSkills:[Lext/mods/gameserver/skills/L2Skill;
       147: return
      LineNumberTable:
        line 35: 0
        line 38: 11
        line 39: 21
        line 42: 31
        line 43: 38
        line 52: 74
        line 53: 82
        line 65: 139
}
SourceFile: "SkillTable.java"
NestMembers:
  ext/mods/gameserver/data/SkillTable$SingletonHolder
  ext/mods/gameserver/data/SkillTable$FrequentSkill
BootstrapMethods:
  0: #251 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #249 SkillTable: Loaded \u0001 skills.
InnerClasses:
  public static final #259= #134 of #14;  // FrequentSkill=class ext/mods/gameserver/data/SkillTable$FrequentSkill of class ext/mods/gameserver/data/SkillTable
  public static final #264= #260 of #262; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
