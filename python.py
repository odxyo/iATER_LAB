class User:
    def __init__(self,name,email,password,follow,follow_list):
        self.name=name
        self.email=email
        self.password=password
        self.follow_list=[]
        self.follow=[]

    def follows(self,follow):#Follow append
        self.follow=follow

    


user1=User("yao","yao@gmail.com","1234",0,0)
user2=User("don","don@gmail.com","1234",0,0)
user3=User("phoukoe","phk@gmail.com","1234",0,0)
user4=User("lasamee","lassamee@gmail.com","1234",0,0)
user5=User("lamud","lamud@gmail.com","1234",1,2)


follow =user1.follow
follow.append(6)
followin = user1.follow_list
followin.append(2)

for i in follow:
    for u in followin:
        print(user1.name,i ,u)

