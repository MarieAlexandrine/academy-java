CREATE VIEW allUsersWithProfile AS
SELECT "user"."userId", ("user"."firstName" ||' '|| "user"."lastName") AS "name",
"user"."username", "profile"."headline", "profile"."bio", "profile"."picture" FROM "user" INNER JOIN "profile" ON "user"."userId"="profile"."userId";

-- Call the allUsersWithProfile VIEW

--SELECT * FROM allUsersWithProfile;

-- Rename the allUsersWithProfile VIEW

ALTER VIEW allUsersWithProfile RENAME TO "allUsersWithProfileView";

-- Insert a new row into the "User" table
INSERT INTO "user"("firstName", "lastName", "username", "phone", "emailId", "password", "emailVerified")
VALUES ('Sarah', 'Gates','gateds', '+1-555-1289', 'gateds@example.com', 'password114', 'true');
-- Insert a new row into the "Profile" table
INSERT INTO "profile" ("userId", "headline", "bio", "city", "country","picture")
VALUES (5, 'London is Red', 'North London forever, no matter the weather! ', 'Montreal', 'Canada', 'https://static.vecteezy.com/arsenal.jpg');
-- Call the allUsersWithProfileView VIEW
SELECT * FROM "allUsersWithProfileView";
-- Drop the allUsersWithProfileView VIEW
DROP VIEW "allUsersWithProfileView";