# MyPro01

## ����

���ֲ�����

## ����ܹ�
```
base��������
	Test.java�������࣬���ࣩ
controller�����ƣ�
	Data.java�����ݣ�
handle������
	HandleLogin.java����¼�����ߣ�
	HandleRegister.java��ע�ᴦ���ߣ�
model��ģ�ͣ�
	Login.java����¼ģ�ͣ�
	Register.java��ע��ģ�ͣ�
tool�����ߣ�
	getConnection.java������JDBC_MySQL���ݿ�����+�������ݿ⣩
	stringUtil.java���ַ��������ࣩ
view����ͼ��
	BackgroundPanel.java���б���ͼƬ��Panel�ࣩ
	Interface_Login.java����¼���棩
	Interface_MainFrame.java�������棩
	Interface_Register.java��ע����棩
	Panel_MusicBook.java����������壩
	Panel_MusicIsland.java�����ֵ���壩
	Panel_MusicTree.java����������壩
	Panel_PersonalInformation.java��������Ϣ��
	Panel_Playlists.java�������б�
	Panel_Seting.java�����ã�
```
## ��װ�̳�

1.  xxxx
2.  xxxx
3.  xxxx

## ʹ��˵��

1.  xxxx
2.  xxxx
3.  xxxx

## ���빱��

1.  Fork ���ֿ�
2.  �½� Feat_xxx ��֧
3.  �ύ����
4.  �½� Pull Request

## �ؼ�

1. ʹ�� Readme\_XXX.md ��֧�ֲ�ͬ�����ԣ����� Readme\_en.md, Readme\_zh.md
2. Gitee �ٷ����� [blog.gitee.com](https://blog.gitee.com)
3. ����� [https://gitee.com/explore](https://gitee.com/explore) �����ַ���˽� Gitee �ϵ����㿪Դ��Ŀ
4. [GVP](https://gitee.com/gvp) ȫ���� Gitee ���м�ֵ��Դ��Ŀ�����ۺ������������㿪Դ��Ŀ
5. Gitee �ٷ��ṩ��ʹ���ֲ� [https://gitee.com/help](https://gitee.com/help)
6. Gitee ����������һ������չʾ Gitee ��Ա��ɵ���Ŀ [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)

# ���

## MVC���

### modelģ�ͣ�

- �洢���ݵĶ���


### view��ͼ��

- Ϊģ���ṩ������ʾ�Ķ���
- ��ʾ���ݣ���ȡ���ݿ��¼��

### controller��������

- �����û��Ľ������������û�����������Ӧ
- ��ģ�ͺ���ͼ���б�Ҫ�Ľ���
- ͨ����ͼ�޸ģ���ȡģ���е����ݣ���ģ�������ݱ仯����ͼ������ʾ
- �������루д�����ݿ��¼��

## ���˼·

### ���ݿ����

- �������ݿ�mypro01
- �����û���users
- ����ע���register

### ����ģ��

- ע��ģ��
- ��¼ģ��
- ����model

### ���ݴ�����

- ע�ᴦ����
- ��¼������
- ����handle

### ��ͼ

# ����
```
User 
	UserID;// �û��˺�
	UserPassword;// �û�����
	UserName;// �û���
	UserSentence;//����ǩ��
	UserGrade;//�û��ȼ�
	UserTime;//�û�������ʱ��
Music
	MusicID;// ����ID
	MusicName;// ����
	MusicTime;//ĳ�豻����ʱ��
Contact
	UserID;// �û��˺�
	MusicID;// ����ID
	UserMusicTime;//ĳ��ĳ������ʱ��
```
