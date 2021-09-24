/*
CRUD

create(insert) ->	생성,추가
read(select)	->	조회
update			->	수정
delete			-> 삭제

*/

SELECT
	COUNT(*),
	user_id,
	user_password,
	user_name
FROM
	user_mst
WHERE 
	user_id = 'junil'
AND user_gender = 1
AND user_name = '김준일';

SELECT
	count(um.user_id) AS user_id,
	count(ud.user_password) AS user_password
FROM
	user_mst um
	LEFT OUTER JOIN user_mst ud ON(ud.user_id = um.user_id AND ud.user_password = '1234')
WHERE
	um.user_id = 'junil';