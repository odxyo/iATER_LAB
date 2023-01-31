class User:
    def __init__(self, name, email, password):
        self.name = name
        self.email = email
        self.password = password
        self.followingList = []
        self.followerList = []

    def follow(self, another_user, status):
        if status == "following":
            self.followingList.append(another_user)
        elif status == "follower":
            self.followerList.append(another_user)
        else:
            print("Invalid data!")

    def numFollowing(self): 
        return len(self.followingList)

    def numFollower(self): 
        return len(self.followerList)

user1 = User("Young", "a@gmail.com", "12345")
user2 = User("Yoonsoo", "b@gmail.com", "12345")
user3 = User("CC", "c@gmail.com", "12345")
user4 = User("DD", "d@gmail.com", "12345")

user1.follow(user4, "follower")
user1.follow(user2, "following")
user1.follow(user2, "follower")

user2.follow(user3, "following")
user3.follow(user2, "follower")
user4.follow(user1, "following")

print(user1.name, user1.numFollowing(), user1.numFollower())
print(user2.name, user2.numFollowing(), user2.numFollower())
print(user3.name, user3.numFollowing(), user3.numFollower())
print(user4.name, user4.numFollowing(), user4.numFollower())
