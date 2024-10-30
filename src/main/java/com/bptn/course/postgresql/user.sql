CREATE TABLE "user" (
  "userId" INT NOT NULL GENERATED ALWAYS AS IDENTITY,
  "firstName" VARCHAR(100) NOT NULL,
  "lastName" VARCHAR(100) NOT NULL,
  "username" VARCHAR(100) NOT NULL,
  "phone" VARCHAR(100) NOT NULL,
  "emailId" VARCHAR(100) NOT NULL,
  "password" VARCHAR(100) NOT NULL,
  "emailVerified" BOOLEAN NOT NULL DEFAULT FALSE,
  "createdOn" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  CONSTRAINT "userPKey" PRIMARY KEY ("userId"),
  CONSTRAINT "userEmailIdKey" UNIQUE ("emailId"),
  CONSTRAINT "userUsernameKey" UNIQUE ("username")
);
-- ========================================
INSERT INTO "user"("firstName", "lastName", "username", "phone", "emailId", "password", "emailVerified")
VALUES ('Jessie', 'Doe','jessiedoe', '+1-555-1234', 'jessiedoe@example.com', 'password123', 'true');
-- Select all rows from the "User" table
SELECT * FROM "user";
--Insert multiple users with a single insert statement using a VALUES list
INSERT INTO "user"("firstName", "lastName", "username", "phone", "emailId", "password", "emailVerified", "createdOn")
VALUES ('Amy', 'Lee', 'amylee', '+1-555-9012', 'amylee@example.com', 'password789', true, NOW()),
('Tom', 'Jones', 'tomjones', '+1-555-3456', 'tomjones@example.com', 'passwordabc', false, NOW()),
('Diana', 'Hill', 'dianahill', '+1-632-3456', 'dianahill@example.com', 'password123', false, NOW());
-- Select all rows from the "User" table where the value of the "emailVerified" column is true
SELECT *FROM "user" WHERE "emailVerified" = true;
-- Insert a few more users into the "User" table, (at least four more)
INSERT INTO "user"("firstName", "lastName", "username", "phone", "emailId", "password", "emailVerified", "createdOn")
VALUES ('Marie', 'Alexandre','malex', '+1-233-3452','malex@bptn.com', 'p@55w0rd',true, NOW()),
 ('Mari', 'Alexa','malexa', '+1-233-3472','malexa@wiki.com', 'p@55word',false, NOW()),
 ('Arie', 'Xandre','arxa', '+1-683-3452','arxa@yahoo.com', 'p@5sw0rd',false, NOW()),
 ('Lisa', 'Alex','lalex', '+1-248-3452','lalex@example.com', 'p@ssw0rd',true, NOW());
-- Update user with username "tomjones"
UPDATE "user" SET "username"= 'randyjones' WHERE "username"='tomjones';
SELECT * FROM "user" WHERE "username"='randyjones';
DELETE FROM "user"WHERE "username"='randyjones';
