// Bytecode for: ext.mods.commons.data.xml.IXmlReader$XMLErrorHandler
// File: ext\mods\commons\data\xml\IXmlReader$XMLErrorHandler.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/data/xml/IXmlReader$XMLErrorHandler.class
  Last modified 9 de jul de 2026; size 869 bytes
  MD5 checksum 0cc0ce0db7fbaaa17ae8ff7cda9081b8
  Compiled from "IXmlReader.java"
public class ext.mods.commons.data.xml.IXmlReader$XMLErrorHandler implements org.xml.sax.ErrorHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #7                          // ext/mods/commons/data/xml/IXmlReader$XMLErrorHandler
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 4, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/commons/data/xml/IXmlReader$XMLErrorHandler
   #8 = Utf8               ext/mods/commons/data/xml/IXmlReader$XMLErrorHandler
   #9 = Class              #10            // org/xml/sax/ErrorHandler
  #10 = Utf8               org/xml/sax/ErrorHandler
  #11 = Utf8               Code
  #12 = Utf8               LineNumberTable
  #13 = Utf8               LocalVariableTable
  #14 = Utf8               this
  #15 = Utf8               Lext/mods/commons/data/xml/IXmlReader$XMLErrorHandler;
  #16 = Utf8               warning
  #17 = Utf8               (Lorg/xml/sax/SAXParseException;)V
  #18 = Utf8               e
  #19 = Utf8               Lorg/xml/sax/SAXParseException;
  #20 = Utf8               Exceptions
  #21 = Class              #22            // org/xml/sax/SAXParseException
  #22 = Utf8               org/xml/sax/SAXParseException
  #23 = Utf8               error
  #24 = Utf8               fatalError
  #25 = Utf8               SourceFile
  #26 = Utf8               IXmlReader.java
  #27 = Utf8               NestHost
  #28 = Class              #29            // ext/mods/commons/data/xml/IXmlReader
  #29 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #30 = Utf8               InnerClasses
  #31 = Utf8               XMLErrorHandler
{
  public ext.mods.commons.data.xml.IXmlReader$XMLErrorHandler();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 507: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/data/xml/IXmlReader$XMLErrorHandler;

  public void warning(org.xml.sax.SAXParseException) throws org.xml.sax.SAXParseException;
    descriptor: (Lorg/xml/sax/SAXParseException;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_1
         1: athrow
      LineNumberTable:
        line 512: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/commons/data/xml/IXmlReader$XMLErrorHandler;
            0       2     1     e   Lorg/xml/sax/SAXParseException;
    Exceptions:
      throws org.xml.sax.SAXParseException

  public void error(org.xml.sax.SAXParseException) throws org.xml.sax.SAXParseException;
    descriptor: (Lorg/xml/sax/SAXParseException;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_1
         1: athrow
      LineNumberTable:
        line 518: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/commons/data/xml/IXmlReader$XMLErrorHandler;
            0       2     1     e   Lorg/xml/sax/SAXParseException;
    Exceptions:
      throws org.xml.sax.SAXParseException

  public void fatalError(org.xml.sax.SAXParseException) throws org.xml.sax.SAXParseException;
    descriptor: (Lorg/xml/sax/SAXParseException;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_1
         1: athrow
      LineNumberTable:
        line 524: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/commons/data/xml/IXmlReader$XMLErrorHandler;
            0       2     1     e   Lorg/xml/sax/SAXParseException;
    Exceptions:
      throws org.xml.sax.SAXParseException
}
SourceFile: "IXmlReader.java"
NestHost: class ext/mods/commons/data/xml/IXmlReader
InnerClasses:
  public static #31= #7 of #28;           // XMLErrorHandler=class ext/mods/commons/data/xml/IXmlReader$XMLErrorHandler of class ext/mods/commons/data/xml/IXmlReader
