select specialist_monolith_isledovaniya.id, monolith.name , specialist_isledovaniya.name 
from specialist_monolith_isledovaniya, monolith, specialist_isledovaniya 
where monolith.id = specialist_monolith_isledovaniya.monolith_id and 
specialist_isledovaniya.id = specialist_monolith_isledovaniya.spesialist_id;

