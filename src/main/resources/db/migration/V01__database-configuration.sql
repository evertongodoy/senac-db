CREATE TABLE IF NOT EXISTS library.book
(
  id                       BIGINT AUTO_INCREMENT PRIMARY KEY,
  title                    VARCHAR(100) NOT NULL,
  published_at             DATE NOT NULL,
  isbn                     VARCHAR(20),
  price                    NUMERIC(10, 2) NOT NULL
);

ALTER TABLE library.book ADD CONSTRAINT UC_TITLE UNIQUE (title);
ALTER TABLE library.book ADD CONSTRAINT UC_ISBN UNIQUE (isbn);

CREATE INDEX IDX_BOOK_TITLE ON library.book (title);

insert into library.book (title, published_at, isbn, price) values ('Lone Wolf McQuade', '2020-02-12', '021473091-3', 292.11);
insert into library.book (title, published_at, isbn, price) values ('Humanoids from the Deep', '2022-10-08', '202614306-4', 84.41);
insert into library.book (title, published_at, isbn, price) values ('Would You Rather', '1983-05-25', '992561311-6', 382.64);
insert into library.book (title, published_at, isbn, price) values ('Leap of Faith', '2005-03-01', '631437153-8', 141.19);
insert into library.book (title, published_at, isbn, price) values ('Ride Lonesome', '1990-07-03', '168005997-1', 492.94);
insert into library.book (title, published_at, isbn, price) values ('Che: Part One', '1990-11-03', '561827563-5', 432.11);
insert into library.book (title, published_at, isbn, price) values ('Roman Holiday', '1996-11-04', '312300976-9', 297.88);
insert into library.book (title, published_at, isbn, price) values ('Eye of God', '1988-03-07', '599128678-7', 273.25);
insert into library.book (title, published_at, isbn, price) values ('My Sassy Girl', '1987-01-18', '364841546-8', 252.79);
insert into library.book (title, published_at, isbn, price) values ('Village People', '2017-10-17', '038619495-5', 418.13);
insert into library.book (title, published_at, isbn, price) values ('Hell Town (Born to the West)', '1991-05-09', '588705248-1', 142.2);
insert into library.book (title, published_at, isbn, price) values ('Song of Sparrows, The (Avaze gonjeshk-ha)', '2000-03-26', '841176961-5', 475.64);
insert into library.book (title, published_at, isbn, price) values ('Bullet', '2009-02-28', '399756249-0', 366.17);
insert into library.book (title, published_at, isbn, price) values ('Two for the Seesaw', '2012-02-02', '195871359-7', 337.75);
insert into library.book (title, published_at, isbn, price) values ('One Life', '2018-08-15', '452577085-6', 335.69);
insert into library.book (title, published_at, isbn, price) values ('Dunwich Horror, The', '2000-07-21', '219390119-8', 349.99);
insert into library.book (title, published_at, isbn, price) values ('The Periwig-Maker', '2011-07-11', '461833570-X', 473.94);
insert into library.book (title, published_at, isbn, price) values ('Cracks', '1982-01-19', '841218661-3', 473.36);
insert into library.book (title, published_at, isbn, price) values ('Armageddon (Armaguedon)', '1993-06-27', '939968178-5', 372.8);
insert into library.book (title, published_at, isbn, price) values ('Fathers'' Day', '2004-06-02', '803920921-8', 332.01);
insert into library.book (title, published_at, isbn, price) values ('Hud', '2016-10-20', '135787544-4', 248.17);
insert into library.book (title, published_at, isbn, price) values ('Shaolin Kung Fu Mystagogue (Da mo mi zong)', '2001-10-12', '114926768-2', 446.5);
insert into library.book (title, published_at, isbn, price) values ('Broom-Stick Bunny', '2023-11-12', '420928110-7', 89.73);
insert into library.book (title, published_at, isbn, price) values ('Oranges, The', '2001-10-30', '648655478-9', 143.14);
insert into library.book (title, published_at, isbn, price) values ('Applause', '1986-01-10', '331524282-8', 325.5);
insert into library.book (title, published_at, isbn, price) values ('Long Way Round', '1988-09-18', '718875149-8', 342.6);
insert into library.book (title, published_at, isbn, price) values ('Swimming Pool', '2019-11-14', '198140769-3', 484.61);
insert into library.book (title, published_at, isbn, price) values ('Santa Claus: The Movie', '1992-02-01', '079072979-2', 316.44);
insert into library.book (title, published_at, isbn, price) values ('Pillow Talk', '1989-11-05', '056229013-3', 430.88);
insert into library.book (title, published_at, isbn, price) values ('ZMD: Zombies of Mass Destruction', '2006-02-25', '388447338-7', 175.92);
insert into library.book (title, published_at, isbn, price) values ('School Ties', '1984-08-14', '215815720-8', 463.06);
insert into library.book (title, published_at, isbn, price) values ('Blind Sunflowers, The (Los girasoles ciegos)', '1997-11-18', '053917295-2', 467.49);
insert into library.book (title, published_at, isbn, price) values ('Involuntary (De ofrivilliga)', '1985-06-05', '495467149-3', 276.15);
insert into library.book (title, published_at, isbn, price) values ('Finger, The (Dedo, El)', '1997-12-09', '088631507-7', 257.17);
insert into library.book (title, published_at, isbn, price) values ('Rain People, The', '2007-09-21', '527028754-4', 65.58);
insert into library.book (title, published_at, isbn, price) values ('Bush Mama', '2007-11-30', '591294223-6', 361.97);
insert into library.book (title, published_at, isbn, price) values ('Shaolin Temple (Shao Lin si)', '2000-02-08', '663378814-2', 311.69);
insert into library.book (title, published_at, isbn, price) values ('Suicide Club', '1980-05-11', '879099858-8', 244.86);
insert into library.book (title, published_at, isbn, price) values ('Hot Saturday', '1986-04-10', '532445866-X', 283.21);
insert into library.book (title, published_at, isbn, price) values ('Mother Knows Best', '1987-12-19', '877800409-8', 226.68);
insert into library.book (title, published_at, isbn, price) values ('I Want to Look Like That Guy', '2002-09-07', '698703523-7', 177.91);
insert into library.book (title, published_at, isbn, price) values ('Fabulous Baker Boys, The', '1995-11-06', '718281745-4', 63.89);
insert into library.book (title, published_at, isbn, price) values ('Dragonwyck', '1981-02-28', '764330357-6', 173.68);
insert into library.book (title, published_at, isbn, price) values ('Beginners', '1991-12-26', '098363907-8', 91.88);
insert into library.book (title, published_at, isbn, price) values ('Love Is a Many-Splendored Thing', '2020-07-18', '993857678-8', 118.36);
insert into library.book (title, published_at, isbn, price) values ('Good Copy Bad Copy', '2001-05-14', '765725176-X', 57.02);
insert into library.book (title, published_at, isbn, price) values ('Robinson Crusoe (Daniel Defoe''s Robinson Crusoe)', '2022-08-22', '003627872-6', 126.79);
insert into library.book (title, published_at, isbn, price) values ('Raanjhanaa', '1993-03-30', '315031481-X', 229.54);
insert into library.book (title, published_at, isbn, price) values ('Barocco', '1981-12-14', '226585425-5', 417.15);
insert into library.book (title, published_at, isbn, price) values ('Lust for Gold', '2000-01-20', '647521525-2', 203.66);
insert into library.book (title, published_at, isbn, price) values ('Common Threads: Stories from the Quilt', '1991-04-29', '737848920-4', 126.46);
insert into library.book (title, published_at, isbn, price) values ('Eaten Alive (Mangiati Vivi)', '2001-10-02', '380665678-9', 93.72);
insert into library.book (title, published_at, isbn, price) values ('Mr. & Mrs. Smith', '1985-06-03', '477362729-8', 186.99);
insert into library.book (title, published_at, isbn, price) values ('Trash Humpers', '2004-01-25', '223709166-8', 192.0);
insert into library.book (title, published_at, isbn, price) values ('It''s My Party', '1985-07-27', '788723489-1', 366.21);
insert into library.book (title, published_at, isbn, price) values ('Persona non grata', '1989-09-07', '895356651-7', 243.96);
insert into library.book (title, published_at, isbn, price) values ('Life and Death of Colonel Blimp, The', '1985-09-05', '847041856-4', 435.18);
insert into library.book (title, published_at, isbn, price) values ('Rack, The', '1998-07-25', '178988274-5', 298.5);
insert into library.book (title, published_at, isbn, price) values ('Julian Po', '2007-11-09', '273934456-2', 433.87);
insert into library.book (title, published_at, isbn, price) values ('Daybreakers', '2019-09-19', '521904830-9', 302.39);
insert into library.book (title, published_at, isbn, price) values ('Longtime Companion', '1988-06-23', '427222697-5', 52.31);
insert into library.book (title, published_at, isbn, price) values ('Jab We Met', '1996-05-22', '298414030-3', 320.93);
insert into library.book (title, published_at, isbn, price) values ('Edge of Seventeen', '2001-09-04', '532491828-8', 162.59);
insert into library.book (title, published_at, isbn, price) values ('Rebound, The', '2013-08-16', '686011112-7', 149.66);
insert into library.book (title, published_at, isbn, price) values ('Crazy as Hell', '1993-01-25', '035193978-4', 361.18);
insert into library.book (title, published_at, isbn, price) values ('Hamlet Goes Business (Hamlet liikemaailmassa)', '2017-01-23', '821958553-6', 497.21);
insert into library.book (title, published_at, isbn, price) values ('Steam: The Turkish Bath (Hamam)', '2020-10-29', '564390638-4', 264.23);
insert into library.book (title, published_at, isbn, price) values ('American Crude', '2002-08-20', '715578300-5', 496.67);
insert into library.book (title, published_at, isbn, price) values ('Summit, The', '2015-05-13', '605573023-5', 325.15);
insert into library.book (title, published_at, isbn, price) values ('Future Weather', '2005-05-04', '758081969-4', 493.67);
insert into library.book (title, published_at, isbn, price) values ('Weird Woman', '1989-05-28', '028264311-7', 167.35);
insert into library.book (title, published_at, isbn, price) values ('Moon Zero Two', '2017-07-18', '753397009-8', 445.42);
insert into library.book (title, published_at, isbn, price) values ('Schultze Gets the Blues', '2010-07-02', '673204157-6', 61.73);
insert into library.book (title, published_at, isbn, price) values ('Titfield Thunderbolt, The', '2000-08-19', '751627450-X', 207.93);
insert into library.book (title, published_at, isbn, price) values ('Bedazzled', '2013-12-08', '013921634-0', 66.76);
insert into library.book (title, published_at, isbn, price) values ('The Duke of Burgundy', '2020-06-17', '198391801-6', 437.39);
insert into library.book (title, published_at, isbn, price) values ('Statement, The', '2009-12-29', '224594956-0', 493.56);
insert into library.book (title, published_at, isbn, price) values ('Gypsy', '2002-10-24', '790060912-1', 465.78);
insert into library.book (title, published_at, isbn, price) values ('Louis C.K.: Shameless', '1983-05-22', '346256097-2', 364.41);
insert into library.book (title, published_at, isbn, price) values ('Heaven Help Us', '1989-04-08', '498797344-8', 288.21);
insert into library.book (title, published_at, isbn, price) values ('Blood Shot', '1992-12-31', '158231147-1', 383.17);
insert into library.book (title, published_at, isbn, price) values ('Bachelor in Paradise', '2006-07-17', '781659755-X', 199.71);
insert into library.book (title, published_at, isbn, price) values ('Sabah', '2018-01-03', '548555933-6', 108.54);
insert into library.book (title, published_at, isbn, price) values ('We Live in Public', '1981-11-03', '891436176-4', 172.1);
insert into library.book (title, published_at, isbn, price) values ('Welcome to Macintosh', '2004-12-13', '254171316-9', 458.61);
insert into library.book (title, published_at, isbn, price) values ('Barkleys of Broadway, The', '1981-08-19', '423575451-3', 233.99);
insert into library.book (title, published_at, isbn, price) values ('Stargate SG-1 Children of the Gods - Final Cut', '1988-11-05', '126126055-4', 406.65);
insert into library.book (title, published_at, isbn, price) values ('Xiu Xiu: The Sent-Down Girl (Tian yu)', '1986-03-13', '277902180-2', 289.67);
insert into library.book (title, published_at, isbn, price) values ('Cialo', '1982-01-16', '246385297-6', 178.2);
insert into library.book (title, published_at, isbn, price) values ('Miss Potter', '2024-06-09', '177257975-0', 57.34);
insert into library.book (title, published_at, isbn, price) values ('Girl on a Bicycle', '2003-06-24', '546627610-3', 275.32);
insert into library.book (title, published_at, isbn, price) values ('Blackadder''s Christmas Carol', '2008-02-22', '579892962-0', 273.62);
insert into library.book (title, published_at, isbn, price) values ('Song Remains the Same, The', '1997-08-05', '010723514-5', 271.69);
insert into library.book (title, published_at, isbn, price) values ('Wend Kuuni (a.k.a. God''s Gift)', '1989-07-18', '245313136-2', 431.85);
insert into library.book (title, published_at, isbn, price) values ('Anatahan', '1995-09-11', '244977877-2', 437.51);
insert into library.book (title, published_at, isbn, price) values ('Lady Sings the Blues', '2007-12-23', '851584859-7', 277.22);
insert into library.book (title, published_at, isbn, price) values ('What Happened, Miss Simone?', '1984-05-08', '227922866-1', 449.99);
insert into library.book (title, published_at, isbn, price) values ('No End in Sight', '1998-02-22', '849465642-2', 426.22);
insert into library.book (title, published_at, isbn, price) values ('World according to Ion B., The (Lumea vazuta de Ion B)', '2007-10-22', '839579370-7', 363.28);
insert into library.book (title, published_at, isbn, price) values ('Don Quixote (Don Quijote de Orson Welles)', '2010-12-02', '634909723-8', 191.78);
