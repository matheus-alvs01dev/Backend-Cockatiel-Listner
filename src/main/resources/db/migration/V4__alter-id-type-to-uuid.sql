
ALTER TABLE cockatiels
    DROP COLUMN IF EXISTS id;


ALTER TABLE cockatiels
    ADD COLUMN id UUID DEFAULT uuid_generate_v4() PRIMARY KEY;