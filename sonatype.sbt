licenses := Seq("APL2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))
homepage := Some(url("https://github.com/arnohaase/simple-akka-downing"))
scmInfo := Some(
  ScmInfo(
    url("https://github.com/codacy/simple-akka-downing"), "scm:git@github.com:codacy/simple-akka-downing.git"
  )
)
developers := List(
  Developer(id="arnohaase", name="Arno Haase", email="arno.haase@haase-consulting.com", url=url("http://haase-consulting.com"))
)

// this setting is not picked up properly from the plugin
pgpPassphrase := Option(System.getenv("SONATYPE_GPG_PASSPHRASE")).map(_.toCharArray)

publicMvnPublish
