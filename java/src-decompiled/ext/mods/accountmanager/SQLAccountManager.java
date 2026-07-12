// Bytecode for: ext.mods.accountmanager.SQLAccountManager
// File: ext\mods\accountmanager\SQLAccountManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/accountmanager/SQLAccountManager.class
  Last modified 9 de jul de 2026; size 7728 bytes
  MD5 checksum 5107ac014c108043cd365d3830f2c687
  Compiled from "SQLAccountManager.java"
public class ext.mods.accountmanager.SQLAccountManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #53                         // ext/mods/accountmanager/SQLAccountManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 7, methods: 7, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/Config.loadAccountManager:()V
    #8 = Class              #10           // ext/mods/Config
    #9 = NameAndType        #11:#6        // loadAccountManager:()V
   #10 = Utf8               ext/mods/Config
   #11 = Utf8               loadAccountManager
   #12 = Methodref          #13.#14       // ext/mods/commons/pool/ConnectionPool.init:()V
   #13 = Class              #15           // ext/mods/commons/pool/ConnectionPool
   #14 = NameAndType        #16:#6        // init:()V
   #15 = Utf8               ext/mods/commons/pool/ConnectionPool
   #16 = Utf8               init
   #17 = Class              #18           // java/util/Scanner
   #18 = Utf8               java/util/Scanner
   #19 = Fieldref           #20.#21       // java/lang/System.in:Ljava/io/InputStream;
   #20 = Class              #22           // java/lang/System
   #21 = NameAndType        #23:#24       // in:Ljava/io/InputStream;
   #22 = Utf8               java/lang/System
   #23 = Utf8               in
   #24 = Utf8               Ljava/io/InputStream;
   #25 = Methodref          #17.#26       // java/util/Scanner."<init>":(Ljava/io/InputStream;)V
   #26 = NameAndType        #5:#27        // "<init>":(Ljava/io/InputStream;)V
   #27 = Utf8               (Ljava/io/InputStream;)V
   #28 = Fieldref           #20.#29       // java/lang/System.out:Ljava/io/PrintStream;
   #29 = NameAndType        #30:#31       // out:Ljava/io/PrintStream;
   #30 = Utf8               out
   #31 = Utf8               Ljava/io/PrintStream;
   #32 = String             #33           // Please choose an option:
   #33 = Utf8               Please choose an option:
   #34 = Methodref          #35.#36       // java/io/PrintStream.println:(Ljava/lang/String;)V
   #35 = Class              #37           // java/io/PrintStream
   #36 = NameAndType        #38:#39       // println:(Ljava/lang/String;)V
   #37 = Utf8               java/io/PrintStream
   #38 = Utf8               println
   #39 = Utf8               (Ljava/lang/String;)V
   #40 = Methodref          #35.#41       // java/io/PrintStream.println:()V
   #41 = NameAndType        #38:#6        // println:()V
   #42 = String             #43           // 1 - Create new account or update existing one (change pass and access level)
   #43 = Utf8               1 - Create new account or update existing one (change pass and access level)
   #44 = String             #45           // 2 - Change access level
   #45 = Utf8               2 - Change access level
   #46 = String             #47           // 3 - Delete existing account
   #47 = Utf8               3 - Delete existing account
   #48 = String             #49           // 4 - List accounts and access levels
   #49 = Utf8               4 - List accounts and access levels
   #50 = String             #51           // 5 - Exit
   #51 = Utf8               5 - Exit
   #52 = Fieldref           #53.#54       // ext/mods/accountmanager/SQLAccountManager._mode:Ljava/lang/String;
   #53 = Class              #55           // ext/mods/accountmanager/SQLAccountManager
   #54 = NameAndType        #56:#57       // _mode:Ljava/lang/String;
   #55 = Utf8               ext/mods/accountmanager/SQLAccountManager
   #56 = Utf8               _mode
   #57 = Utf8               Ljava/lang/String;
   #58 = String             #59           // 1
   #59 = Utf8               1
   #60 = Methodref          #61.#62       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #61 = Class              #63           // java/lang/String
   #62 = NameAndType        #64:#65       // equals:(Ljava/lang/Object;)Z
   #63 = Utf8               java/lang/String
   #64 = Utf8               equals
   #65 = Utf8               (Ljava/lang/Object;)Z
   #66 = String             #67           // 2
   #67 = Utf8               2
   #68 = String             #69           // 3
   #69 = Utf8               3
   #70 = String             #71           // 4
   #71 = Utf8               4
   #72 = String             #73           // 5
   #73 = Utf8               5
   #74 = String             #75           // Your choice:
   #75 = Utf8               Your choice:
   #76 = Methodref          #35.#77       // java/io/PrintStream.print:(Ljava/lang/String;)V
   #77 = NameAndType        #78:#39       // print:(Ljava/lang/String;)V
   #78 = Utf8               print
   #79 = Methodref          #17.#80       // java/util/Scanner.next:()Ljava/lang/String;
   #80 = NameAndType        #81:#82       // next:()Ljava/lang/String;
   #81 = Utf8               next
   #82 = Utf8               ()Ljava/lang/String;
   #83 = Fieldref           #53.#84       // ext/mods/accountmanager/SQLAccountManager._uname:Ljava/lang/String;
   #84 = NameAndType        #85:#57       // _uname:Ljava/lang/String;
   #85 = Utf8               _uname
   #86 = Methodref          #61.#87       // java/lang/String.trim:()Ljava/lang/String;
   #87 = NameAndType        #88:#82       // trim:()Ljava/lang/String;
   #88 = Utf8               trim
   #89 = Methodref          #61.#90       // java/lang/String.length:()I
   #90 = NameAndType        #91:#92       // length:()I
   #91 = Utf8               length
   #92 = Utf8               ()I
   #93 = String             #94           // Username:
   #94 = Utf8               Username:
   #95 = Methodref          #61.#96       // java/lang/String.toLowerCase:()Ljava/lang/String;
   #96 = NameAndType        #97:#82       // toLowerCase:()Ljava/lang/String;
   #97 = Utf8               toLowerCase
   #98 = Fieldref           #53.#99       // ext/mods/accountmanager/SQLAccountManager._pass:Ljava/lang/String;
   #99 = NameAndType        #100:#57      // _pass:Ljava/lang/String;
  #100 = Utf8               _pass
  #101 = String             #102          // Password:
  #102 = Utf8               Password:
  #103 = Fieldref           #53.#104      // ext/mods/accountmanager/SQLAccountManager._level:Ljava/lang/String;
  #104 = NameAndType        #105:#57      // _level:Ljava/lang/String;
  #105 = Utf8               _level
  #106 = String             #107          // Access level:
  #107 = Utf8               Access level:
  #108 = Methodref          #53.#109      // ext/mods/accountmanager/SQLAccountManager.addOrUpdateAccount:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #109 = NameAndType        #110:#111     // addOrUpdateAccount:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #110 = Utf8               addOrUpdateAccount
  #111 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #112 = Methodref          #53.#113      // ext/mods/accountmanager/SQLAccountManager.changeAccountLevel:(Ljava/lang/String;Ljava/lang/String;)V
  #113 = NameAndType        #114:#115     // changeAccountLevel:(Ljava/lang/String;Ljava/lang/String;)V
  #114 = Utf8               changeAccountLevel
  #115 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #116 = String             #117          // WARNING: This will not delete the gameserver data (characters, items, etc..)
  #117 = Utf8               WARNING: This will not delete the gameserver data (characters, items, etc..)
  #118 = String             #119          //  it will only delete the account login server data.
  #119 = Utf8                it will only delete the account login server data.
  #120 = String             #121          // Do you really want to delete this account? Y/N:
  #121 = Utf8               Do you really want to delete this account? Y/N:
  #122 = String             #123          // Y
  #123 = Utf8               Y
  #124 = Methodref          #61.#125      // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #125 = NameAndType        #126:#127     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #126 = Utf8               equalsIgnoreCase
  #127 = Utf8               (Ljava/lang/String;)Z
  #128 = Methodref          #53.#129      // ext/mods/accountmanager/SQLAccountManager.deleteAccount:(Ljava/lang/String;)V
  #129 = NameAndType        #130:#39      // deleteAccount:(Ljava/lang/String;)V
  #130 = Utf8               deleteAccount
  #131 = String             #132          // Deletion cancelled.
  #132 = Utf8               Deletion cancelled.
  #133 = String             #134          //
  #134 = Utf8
  #135 = String             #136          // Please choose a listing mode:
  #136 = Utf8               Please choose a listing mode:
  #137 = String             #138          // 1 - Banned accounts only (accessLevel < 0)
  #138 = Utf8               1 - Banned accounts only (accessLevel < 0)
  #139 = String             #140          // 2 - GM/privileged accounts (accessLevel > 0
  #140 = Utf8               2 - GM/privileged accounts (accessLevel > 0
  #141 = String             #142          // 3 - Regular accounts only (accessLevel = 0)
  #142 = Utf8               3 - Regular accounts only (accessLevel = 0)
  #143 = String             #144          // 4 - List all
  #144 = Utf8               4 - List all
  #145 = Methodref          #53.#146      // ext/mods/accountmanager/SQLAccountManager.printAccInfo:(Ljava/lang/String;)V
  #146 = NameAndType        #147:#39      // printAccInfo:(Ljava/lang/String;)V
  #147 = Utf8               printAccInfo
  #148 = Methodref          #20.#149      // java/lang/System.exit:(I)V
  #149 = NameAndType        #150:#151     // exit:(I)V
  #150 = Utf8               exit
  #151 = Utf8               (I)V
  #152 = Class              #153          // java/lang/Throwable
  #153 = Utf8               java/lang/Throwable
  #154 = Methodref          #17.#155      // java/util/Scanner.close:()V
  #155 = NameAndType        #156:#6       // close:()V
  #156 = Utf8               close
  #157 = Methodref          #152.#158     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #158 = NameAndType        #159:#160     // addSuppressed:(Ljava/lang/Throwable;)V
  #159 = Utf8               addSuppressed
  #160 = Utf8               (Ljava/lang/Throwable;)V
  #161 = String             #162          // SELECT login, access_level FROM accounts
  #162 = Utf8               SELECT login, access_level FROM accounts
  #163 = String             #164          // WHERE access_level < 0
  #164 = Utf8               WHERE access_level < 0
  #165 = Methodref          #61.#166      // java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
  #166 = NameAndType        #167:#168     // concat:(Ljava/lang/String;)Ljava/lang/String;
  #167 = Utf8               concat
  #168 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #169 = String             #170          // WHERE access_level > 0
  #170 = Utf8               WHERE access_level > 0
  #171 = String             #172          // WHERE access_level = 0
  #172 = Utf8               WHERE access_level = 0
  #173 = String             #174          //  ORDER BY login ASC
  #174 = Utf8                ORDER BY login ASC
  #175 = Methodref          #13.#176      // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #176 = NameAndType        #177:#178     // getConnection:()Ljava/sql/Connection;
  #177 = Utf8               getConnection
  #178 = Utf8               ()Ljava/sql/Connection;
  #179 = InterfaceMethodref #180.#181     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #180 = Class              #182          // java/sql/Connection
  #181 = NameAndType        #183:#184     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #182 = Utf8               java/sql/Connection
  #183 = Utf8               prepareStatement
  #184 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #185 = InterfaceMethodref #186.#187     // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #186 = Class              #188          // java/sql/PreparedStatement
  #187 = NameAndType        #189:#190     // executeQuery:()Ljava/sql/ResultSet;
  #188 = Utf8               java/sql/PreparedStatement
  #189 = Utf8               executeQuery
  #190 = Utf8               ()Ljava/sql/ResultSet;
  #191 = InterfaceMethodref #192.#193     // java/sql/ResultSet.next:()Z
  #192 = Class              #194          // java/sql/ResultSet
  #193 = NameAndType        #81:#195      // next:()Z
  #194 = Utf8               java/sql/ResultSet
  #195 = Utf8               ()Z
  #196 = String             #197          // login
  #197 = Utf8               login
  #198 = InterfaceMethodref #192.#199     // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #199 = NameAndType        #200:#168     // getString:(Ljava/lang/String;)Ljava/lang/String;
  #200 = Utf8               getString
  #201 = String             #202          // access_level
  #202 = Utf8               access_level
  #203 = InterfaceMethodref #192.#204     // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #204 = NameAndType        #205:#206     // getInt:(Ljava/lang/String;)I
  #205 = Utf8               getInt
  #206 = Utf8               (Ljava/lang/String;)I
  #207 = InvokeDynamic      #0:#208       // #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #208 = NameAndType        #209:#210     // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #209 = Utf8               makeConcatWithConstants
  #210 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #211 = InvokeDynamic      #1:#212       // #1:makeConcatWithConstants:(I)Ljava/lang/String;
  #212 = NameAndType        #209:#213     // makeConcatWithConstants:(I)Ljava/lang/String;
  #213 = Utf8               (I)Ljava/lang/String;
  #214 = InterfaceMethodref #192.#155     // java/sql/ResultSet.close:()V
  #215 = InterfaceMethodref #186.#155     // java/sql/PreparedStatement.close:()V
  #216 = InterfaceMethodref #180.#155     // java/sql/Connection.close:()V
  #217 = Class              #218          // java/lang/Exception
  #218 = Utf8               java/lang/Exception
  #219 = String             #220          // There was error while displaying accounts:
  #220 = Utf8               There was error while displaying accounts:
  #221 = Methodref          #217.#222     // java/lang/Exception.getMessage:()Ljava/lang/String;
  #222 = NameAndType        #223:#82      // getMessage:()Ljava/lang/String;
  #223 = Utf8               getMessage
  #224 = String             #225          // INSERT INTO accounts(login, password, access_level) VALUES (?, ?, ?) ON DUPLICATE KEY UPDATE password = VALUES(password), access_level = VALUES(access_level)
  #225 = Utf8               INSERT INTO accounts(login, password, access_level) VALUES (?, ?, ?) ON DUPLICATE KEY UPDATE password = VALUES(password), access_level = VALUES(access_level)
  #226 = Methodref          #227.#228     // ext/mods/commons/crypt/BCrypt.hashPw:(Ljava/lang/String;)Ljava/lang/String;
  #227 = Class              #229          // ext/mods/commons/crypt/BCrypt
  #228 = NameAndType        #230:#168     // hashPw:(Ljava/lang/String;)Ljava/lang/String;
  #229 = Utf8               ext/mods/commons/crypt/BCrypt
  #230 = Utf8               hashPw
  #231 = InterfaceMethodref #186.#232     // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #232 = NameAndType        #233:#234     // setString:(ILjava/lang/String;)V
  #233 = Utf8               setString
  #234 = Utf8               (ILjava/lang/String;)V
  #235 = InterfaceMethodref #186.#236     // java/sql/PreparedStatement.executeUpdate:()I
  #236 = NameAndType        #237:#92      // executeUpdate:()I
  #237 = Utf8               executeUpdate
  #238 = InvokeDynamic      #2:#239       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #239 = NameAndType        #209:#168     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #240 = InvokeDynamic      #3:#239       // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #241 = String             #242          // There was error while adding/updating account:
  #242 = Utf8               There was error while adding/updating account:
  #243 = String             #244          // UPDATE accounts SET access_level = ? WHERE login = ?
  #244 = Utf8               UPDATE accounts SET access_level = ? WHERE login = ?
  #245 = InvokeDynamic      #4:#239       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #246 = String             #247          // There was error while updating account:
  #247 = Utf8               There was error while updating account:
  #248 = String             #249          // DELETE FROM accounts WHERE login = ?
  #249 = Utf8               DELETE FROM accounts WHERE login = ?
  #250 = InvokeDynamic      #5:#239       // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #251 = String             #252          // There was error while deleting account:
  #252 = Utf8               There was error while deleting account:
  #253 = Utf8               INSERT_OR_UPDATE_ACCOUNT
  #254 = Utf8               ConstantValue
  #255 = Utf8               UPDATE_ACCOUNT_LEVEL
  #256 = Utf8               DELETE_ACCOUNT
  #257 = Utf8               Code
  #258 = Utf8               LineNumberTable
  #259 = Utf8               LocalVariableTable
  #260 = Utf8               this
  #261 = Utf8               Lext/mods/accountmanager/SQLAccountManager;
  #262 = Utf8               main
  #263 = Utf8               ([Ljava/lang/String;)V
  #264 = Utf8               yesno
  #265 = Utf8               _scn
  #266 = Utf8               Ljava/util/Scanner;
  #267 = Utf8               args
  #268 = Utf8               [Ljava/lang/String;
  #269 = Utf8               StackMapTable
  #270 = Class              #268          // "[Ljava/lang/String;"
  #271 = Utf8               rset
  #272 = Utf8               Ljava/sql/ResultSet;
  #273 = Utf8               ps
  #274 = Utf8               Ljava/sql/PreparedStatement;
  #275 = Utf8               con
  #276 = Utf8               Ljava/sql/Connection;
  #277 = Utf8               e
  #278 = Utf8               Ljava/lang/Exception;
  #279 = Utf8               m
  #280 = Utf8               count
  #281 = Utf8               I
  #282 = Utf8               q
  #283 = Utf8               hashed
  #284 = Utf8               account
  #285 = Utf8               password
  #286 = Utf8               level
  #287 = Utf8               <clinit>
  #288 = Utf8               SourceFile
  #289 = Utf8               SQLAccountManager.java
  #290 = Utf8               BootstrapMethods
  #291 = String             #292          // \u0001 -> \u0001
  #292 = Utf8               \u0001 -> \u0001
  #293 = String             #294          // Displayed accounts: \u0001
  #294 = Utf8               Displayed accounts: \u0001
  #295 = String             #296          // Account \u0001 has been created or updated
  #296 = Utf8               Account \u0001 has been created or updated
  #297 = String             #298          // Account \u0001 doesn\'t exist
  #298 = Utf8               Account \u0001 doesn\'t exist
  #299 = String             #300          // Account \u0001 has been updated
  #300 = Utf8               Account \u0001 has been updated
  #301 = String             #302          // Account \u0001 has been deleted
  #302 = Utf8               Account \u0001 has been deleted
  #303 = MethodHandle       6:#304        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #304 = Methodref          #305.#306     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #305 = Class              #307          // java/lang/invoke/StringConcatFactory
  #306 = NameAndType        #209:#308     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #307 = Utf8               java/lang/invoke/StringConcatFactory
  #308 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #309 = Utf8               InnerClasses
  #310 = Class              #311          // java/lang/invoke/MethodHandles$Lookup
  #311 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #312 = Class              #313          // java/lang/invoke/MethodHandles
  #313 = Utf8               java/lang/invoke/MethodHandles
  #314 = Utf8               Lookup
{
  public ext.mods.accountmanager.SQLAccountManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 30: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/accountmanager/SQLAccountManager;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=4, args_size=1
         0: invokestatic  #7                  // Method ext/mods/Config.loadAccountManager:()V
         3: invokestatic  #12                 // Method ext/mods/commons/pool/ConnectionPool.init:()V
         6: new           #17                 // class java/util/Scanner
         9: dup
        10: getstatic     #19                 // Field java/lang/System.in:Ljava/io/InputStream;
        13: invokespecial #25                 // Method java/util/Scanner."<init>":(Ljava/io/InputStream;)V
        16: astore_1
        17: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
        20: ldc           #32                 // String Please choose an option:
        22: invokevirtual #34                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        25: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
        28: invokevirtual #40                 // Method java/io/PrintStream.println:()V
        31: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
        34: ldc           #42                 // String 1 - Create new account or update existing one (change pass and access level)
        36: invokevirtual #34                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        39: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
        42: ldc           #44                 // String 2 - Change access level
        44: invokevirtual #34                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        47: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
        50: ldc           #46                 // String 3 - Delete existing account
        52: invokevirtual #34                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        55: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
        58: ldc           #48                 // String 4 - List accounts and access levels
        60: invokevirtual #34                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        63: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
        66: ldc           #50                 // String 5 - Exit
        68: invokevirtual #34                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        71: getstatic     #52                 // Field _mode:Ljava/lang/String;
        74: ldc           #58                 // String 1
        76: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        79: ifne          144
        82: getstatic     #52                 // Field _mode:Ljava/lang/String;
        85: ldc           #66                 // String 2
        87: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        90: ifne          144
        93: getstatic     #52                 // Field _mode:Ljava/lang/String;
        96: ldc           #68                 // String 3
        98: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       101: ifne          144
       104: getstatic     #52                 // Field _mode:Ljava/lang/String;
       107: ldc           #70                 // String 4
       109: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       112: ifne          144
       115: getstatic     #52                 // Field _mode:Ljava/lang/String;
       118: ldc           #72                 // String 5
       120: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       123: ifne          144
       126: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
       129: ldc           #74                 // String Your choice:
       131: invokevirtual #76                 // Method java/io/PrintStream.print:(Ljava/lang/String;)V
       134: aload_1
       135: invokevirtual #79                 // Method java/util/Scanner.next:()Ljava/lang/String;
       138: putstatic     #52                 // Field _mode:Ljava/lang/String;
       141: goto          71
       144: getstatic     #52                 // Field _mode:Ljava/lang/String;
       147: ldc           #58                 // String 1
       149: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       152: ifne          177
       155: getstatic     #52                 // Field _mode:Ljava/lang/String;
       158: ldc           #66                 // String 2
       160: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       163: ifne          177
       166: getstatic     #52                 // Field _mode:Ljava/lang/String;
       169: ldc           #68                 // String 3
       171: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       174: ifeq          303
       177: getstatic     #83                 // Field _uname:Ljava/lang/String;
       180: invokevirtual #86                 // Method java/lang/String.trim:()Ljava/lang/String;
       183: invokevirtual #89                 // Method java/lang/String.length:()I
       186: ifne          210
       189: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
       192: ldc           #93                 // String Username:
       194: invokevirtual #76                 // Method java/io/PrintStream.print:(Ljava/lang/String;)V
       197: aload_1
       198: invokevirtual #79                 // Method java/util/Scanner.next:()Ljava/lang/String;
       201: invokevirtual #95                 // Method java/lang/String.toLowerCase:()Ljava/lang/String;
       204: putstatic     #83                 // Field _uname:Ljava/lang/String;
       207: goto          177
       210: getstatic     #52                 // Field _mode:Ljava/lang/String;
       213: ldc           #58                 // String 1
       215: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       218: ifeq          251
       221: getstatic     #98                 // Field _pass:Ljava/lang/String;
       224: invokevirtual #86                 // Method java/lang/String.trim:()Ljava/lang/String;
       227: invokevirtual #89                 // Method java/lang/String.length:()I
       230: ifne          251
       233: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
       236: ldc           #101                // String Password:
       238: invokevirtual #76                 // Method java/io/PrintStream.print:(Ljava/lang/String;)V
       241: aload_1
       242: invokevirtual #79                 // Method java/util/Scanner.next:()Ljava/lang/String;
       245: putstatic     #98                 // Field _pass:Ljava/lang/String;
       248: goto          221
       251: getstatic     #52                 // Field _mode:Ljava/lang/String;
       254: ldc           #58                 // String 1
       256: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       259: ifne          273
       262: getstatic     #52                 // Field _mode:Ljava/lang/String;
       265: ldc           #66                 // String 2
       267: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       270: ifeq          303
       273: getstatic     #103                // Field _level:Ljava/lang/String;
       276: invokevirtual #86                 // Method java/lang/String.trim:()Ljava/lang/String;
       279: invokevirtual #89                 // Method java/lang/String.length:()I
       282: ifne          303
       285: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
       288: ldc           #106                // String Access level:
       290: invokevirtual #76                 // Method java/io/PrintStream.print:(Ljava/lang/String;)V
       293: aload_1
       294: invokevirtual #79                 // Method java/util/Scanner.next:()Ljava/lang/String;
       297: putstatic     #103                // Field _level:Ljava/lang/String;
       300: goto          273
       303: getstatic     #52                 // Field _mode:Ljava/lang/String;
       306: ldc           #58                 // String 1
       308: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       311: ifeq          338
       314: getstatic     #83                 // Field _uname:Ljava/lang/String;
       317: invokevirtual #86                 // Method java/lang/String.trim:()Ljava/lang/String;
       320: getstatic     #98                 // Field _pass:Ljava/lang/String;
       323: invokevirtual #86                 // Method java/lang/String.trim:()Ljava/lang/String;
       326: getstatic     #103                // Field _level:Ljava/lang/String;
       329: invokevirtual #86                 // Method java/lang/String.trim:()Ljava/lang/String;
       332: invokestatic  #108                // Method addOrUpdateAccount:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
       335: goto          609
       338: getstatic     #52                 // Field _mode:Ljava/lang/String;
       341: ldc           #66                 // String 2
       343: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       346: ifeq          367
       349: getstatic     #83                 // Field _uname:Ljava/lang/String;
       352: invokevirtual #86                 // Method java/lang/String.trim:()Ljava/lang/String;
       355: getstatic     #103                // Field _level:Ljava/lang/String;
       358: invokevirtual #86                 // Method java/lang/String.trim:()Ljava/lang/String;
       361: invokestatic  #112                // Method changeAccountLevel:(Ljava/lang/String;Ljava/lang/String;)V
       364: goto          609
       367: getstatic     #52                 // Field _mode:Ljava/lang/String;
       370: ldc           #68                 // String 3
       372: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       375: ifeq          449
       378: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
       381: ldc           #116                // String WARNING: This will not delete the gameserver data (characters, items, etc..)
       383: invokevirtual #76                 // Method java/io/PrintStream.print:(Ljava/lang/String;)V
       386: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
       389: ldc           #118                // String  it will only delete the account login server data.
       391: invokevirtual #76                 // Method java/io/PrintStream.print:(Ljava/lang/String;)V
       394: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
       397: invokevirtual #40                 // Method java/io/PrintStream.println:()V
       400: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
       403: ldc           #120                // String Do you really want to delete this account? Y/N:
       405: invokevirtual #76                 // Method java/io/PrintStream.print:(Ljava/lang/String;)V
       408: aload_1
       409: invokevirtual #79                 // Method java/util/Scanner.next:()Ljava/lang/String;
       412: astore_2
       413: aload_2
       414: ifnull        438
       417: aload_2
       418: ldc           #122                // String Y
       420: invokevirtual #124                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       423: ifeq          438
       426: getstatic     #83                 // Field _uname:Ljava/lang/String;
       429: invokevirtual #86                 // Method java/lang/String.trim:()Ljava/lang/String;
       432: invokestatic  #128                // Method deleteAccount:(Ljava/lang/String;)V
       435: goto          446
       438: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
       441: ldc           #131                // String Deletion cancelled.
       443: invokevirtual #34                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       446: goto          609
       449: getstatic     #52                 // Field _mode:Ljava/lang/String;
       452: ldc           #70                 // String 4
       454: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       457: ifeq          594
       460: ldc           #133                // String
       462: putstatic     #52                 // Field _mode:Ljava/lang/String;
       465: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
       468: invokevirtual #40                 // Method java/io/PrintStream.println:()V
       471: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
       474: ldc           #135                // String Please choose a listing mode:
       476: invokevirtual #34                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       479: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
       482: invokevirtual #40                 // Method java/io/PrintStream.println:()V
       485: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
       488: ldc           #137                // String 1 - Banned accounts only (accessLevel < 0)
       490: invokevirtual #34                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       493: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
       496: ldc           #139                // String 2 - GM/privileged accounts (accessLevel > 0
       498: invokevirtual #34                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       501: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
       504: ldc           #141                // String 3 - Regular accounts only (accessLevel = 0)
       506: invokevirtual #34                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       509: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
       512: ldc           #143                // String 4 - List all
       514: invokevirtual #34                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       517: getstatic     #52                 // Field _mode:Ljava/lang/String;
       520: ldc           #58                 // String 1
       522: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       525: ifne          579
       528: getstatic     #52                 // Field _mode:Ljava/lang/String;
       531: ldc           #66                 // String 2
       533: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       536: ifne          579
       539: getstatic     #52                 // Field _mode:Ljava/lang/String;
       542: ldc           #68                 // String 3
       544: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       547: ifne          579
       550: getstatic     #52                 // Field _mode:Ljava/lang/String;
       553: ldc           #70                 // String 4
       555: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       558: ifne          579
       561: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
       564: ldc           #74                 // String Your choice:
       566: invokevirtual #76                 // Method java/io/PrintStream.print:(Ljava/lang/String;)V
       569: aload_1
       570: invokevirtual #79                 // Method java/util/Scanner.next:()Ljava/lang/String;
       573: putstatic     #52                 // Field _mode:Ljava/lang/String;
       576: goto          517
       579: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
       582: invokevirtual #40                 // Method java/io/PrintStream.println:()V
       585: getstatic     #52                 // Field _mode:Ljava/lang/String;
       588: invokestatic  #145                // Method printAccInfo:(Ljava/lang/String;)V
       591: goto          609
       594: getstatic     #52                 // Field _mode:Ljava/lang/String;
       597: ldc           #72                 // String 5
       599: invokevirtual #60                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       602: ifeq          609
       605: iconst_0
       606: invokestatic  #148                // Method java/lang/System.exit:(I)V
       609: ldc           #133                // String
       611: putstatic     #83                 // Field _uname:Ljava/lang/String;
       614: ldc           #133                // String
       616: putstatic     #98                 // Field _pass:Ljava/lang/String;
       619: ldc           #133                // String
       621: putstatic     #103                // Field _level:Ljava/lang/String;
       624: ldc           #133                // String
       626: putstatic     #52                 // Field _mode:Ljava/lang/String;
       629: getstatic     #28                 // Field java/lang/System.out:Ljava/io/PrintStream;
       632: invokevirtual #40                 // Method java/io/PrintStream.println:()V
       635: goto          17
       638: astore_2
       639: aload_1
       640: invokevirtual #154                // Method java/util/Scanner.close:()V
       643: goto          652
       646: astore_3
       647: aload_2
       648: aload_3
       649: invokevirtual #157                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       652: aload_2
       653: athrow
      Exception table:
         from    to  target type
            17   638   638   Class java/lang/Throwable
           639   643   646   Class java/lang/Throwable
      LineNumberTable:
        line 43: 0
        line 45: 3
        line 47: 6
        line 51: 17
        line 52: 25
        line 53: 31
        line 54: 39
        line 55: 47
        line 56: 55
        line 57: 63
        line 59: 71
        line 61: 126
        line 62: 134
        line 65: 144
        line 67: 177
        line 69: 189
        line 70: 197
        line 73: 210
        line 75: 221
        line 77: 233
        line 78: 241
        line 82: 251
        line 84: 273
        line 86: 285
        line 87: 293
        line 92: 303
        line 93: 314
        line 94: 338
        line 95: 349
        line 96: 367
        line 98: 378
        line 99: 386
        line 100: 394
        line 101: 400
        line 103: 408
        line 104: 413
        line 105: 426
        line 107: 438
        line 108: 446
        line 109: 449
        line 111: 460
        line 112: 465
        line 113: 471
        line 114: 479
        line 115: 485
        line 116: 493
        line 117: 501
        line 118: 509
        line 120: 517
        line 122: 561
        line 123: 569
        line 126: 579
        line 127: 585
        line 129: 594
        line 130: 605
        line 132: 609
        line 133: 614
        line 134: 619
        line 135: 624
        line 136: 629
        line 47: 638
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          413      33     2 yesno   Ljava/lang/String;
           17     637     1  _scn   Ljava/util/Scanner;
            0     654     0  args   [Ljava/lang/String;
      StackMapTable: number_of_entries = 21
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class java/util/Scanner ]
        frame_type = 53 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 72
        frame_type = 32 /* same */
        frame_type = 32 /* same */
        frame_type = 10 /* same */
        frame_type = 29 /* same */
        frame_type = 21 /* same */
        frame_type = 29 /* same */
        frame_type = 34 /* same */
        frame_type = 28 /* same */
        frame_type = 252 /* append */
          offset_delta = 70
          locals = [ class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 2 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 67
        frame_type = 61 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 92 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class "[Ljava/lang/String;", class java/util/Scanner, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: ldc           #133                // String
         2: putstatic     #83                 // Field _uname:Ljava/lang/String;
         5: ldc           #133                // String
         7: putstatic     #98                 // Field _pass:Ljava/lang/String;
        10: ldc           #133                // String
        12: putstatic     #103                // Field _level:Ljava/lang/String;
        15: ldc           #133                // String
        17: putstatic     #52                 // Field _mode:Ljava/lang/String;
        20: return
      LineNumberTable:
        line 36: 0
        line 37: 5
        line 38: 10
        line 39: 15
}
SourceFile: "SQLAccountManager.java"
BootstrapMethods:
  0: #303 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #291 \u0001 -> \u0001
  1: #303 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #293 Displayed accounts: \u0001
  2: #303 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #295 Account \u0001 has been created or updated
  3: #303 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #297 Account \u0001 doesn\'t exist
  4: #303 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #299 Account \u0001 has been updated
  5: #303 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #301 Account \u0001 has been deleted
InnerClasses:
  public static final #314= #310 of #312; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
