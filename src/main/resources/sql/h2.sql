ALTER TABLE POST
  ALTER COLUMN create_date SET DEFAULT CURRENT_TIMESTAMP;

-- Users
-- password: "password"
INSERT INTO USER (user_id, firstname, surname, email, username, password, active)
VALUES
  (1, 'firstname', 'surname', 'user@gmail.com', 'username', '$2a$06$OAPObzhRdRXBCbk7Hj/ot.jY3zPwR8n7/mfLtKIgTzdJa4.6TwsIm',
   1);

-- Posts
INSERT INTO POST (post_id, isSchoolProjectId, situationDescription , deadline, schedule, problemDescription, yourSkills, programmingLanguagesId)
VALUES (1, 1, 'true', '"blaablaa"', '"12.12"', '"blalbal"', '"fefe"', '"fefe"', 'true');
 


